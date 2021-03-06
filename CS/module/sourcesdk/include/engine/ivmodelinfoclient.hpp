#pragma once

#include "qangle.hpp"
#include "studio.hpp"
#include "ienginetrace.hpp"
#include "interfaces.h"


namespace Envy
{
	namespace SourceEngine
	{
		class CPhysCollide;
		class CUtlBuffer;
		class IClientRenderable;
		class CStudioHdr;
		struct virtualmodel_t;

		enum RenderableTranslucencyType_t
		{
			RENDERABLE_IS_OPAQUE = 0,
			RENDERABLE_IS_TRANSLUCENT,
			RENDERABLE_IS_TWO_PASS,    // has both translucent and opaque sub-partsa
		};

		class _IVModelInfo_
		{
		public:
			virtual                                 ~_IVModelInfo_(void) {}
			virtual const model_t* GetModel(int modelindex) const = 0;
			// Returns index of model by name
			virtual int						GetModelIndex(const char* name) const = 0;
			// Returns name of model
			virtual const char* GetModelName(const model_t* model) const = 0;
			virtual void					Unused30() {};
			virtual vcollide_t* GetVCollide(const model_t* model) const = 0;
			virtual vcollide_t* GetVCollide(int modelindex) const = 0;
			virtual void					GetModelBounds(const model_t* model, Vector& mins, Vector& maxs) const = 0;
			virtual	void					GetModelRenderBounds(const model_t* model, Vector& mins, Vector& maxs) const = 0;
			virtual int						GetModelFrameCount(const model_t* model) const = 0;
			virtual int						GetModelType(const model_t* model) const = 0;
			virtual void* GetModelExtraData(const model_t* model) = 0;
			virtual bool					ModelHasMaterialProxy(const model_t* model) const = 0;
			virtual bool					IsTranslucent(model_t const* model) const = 0;
			virtual bool					IsTranslucentTwoPass(const model_t* model) const = 0;
			virtual void					Unused0() {};
			virtual RenderableTranslucencyType_t ComputeTranslucencyType(const model_t* model, int nSkin, int nBody) = 0;
			virtual int						GetModelMaterialCount(const model_t* model) const = 0;
			virtual void					GetModelMaterials(const model_t* model, int count, IMaterial** ppMaterials) = 0;
			virtual bool					IsModelVertexLit(const model_t* model) const = 0;
			virtual const char* GetModelKeyValueText(const model_t* model) = 0;
			virtual bool					GetModelKeyValue(const model_t* model, CUtlBuffer& buf) = 0; // supports keyvalue blocks in submodels
			virtual float					GetModelRadius(const model_t* model) = 0;

			virtual const studiohdr_t* FindModel(const studiohdr_t* pStudioHdr, void** cache, const char* modelname) const = 0;
			virtual const studiohdr_t* FindModel(void* cache) const = 0;
			virtual	virtualmodel_t* GetVirtualModel(const studiohdr_t* pStudioHdr) const = 0;
			virtual uint8_t*		GetAnimBlock(const studiohdr_t* pStudioHdr, int iBlock) const = 0;
			virtual bool					HasAnimBlockBeenPreloaded(studiohdr_t const*, int) const = 0;

			// Available on client only!!!
			virtual void					GetModelMaterialColorAndLighting(const model_t* model, Vector const& origin,
				QAngle const& angles, trace_t* pTrace,
				Vector& lighting, Vector& matColor) = 0;
			virtual void					GetIlluminationPoint(const model_t* model, IClientRenderable* pRenderable, Vector const& origin,
				QAngle const& angles, Vector* pLightingCenter) = 0;
			virtual int						GetModelContents(int modelIndex) const = 0;
			virtual void					Unused31() {};
			virtual studiohdr_t* GetStudioModel(const model_t* mod) = 0;
			virtual int						GetModelSpriteWidth(const model_t* model) const = 0;
			virtual int						GetModelSpriteHeight(const model_t* model) const = 0;

			// Sets/gets a map-specified fade range (client only)
			virtual void					SetLevelScreenFadeRange(float flMinSize, float flMaxSize) = 0;
			virtual void					GetLevelScreenFadeRange(float* pMinArea, float* pMaxArea) const = 0;

			// Sets/gets a map-specified per-view fade range (client only)
			virtual void					SetViewScreenFadeRange(float flMinSize, float flMaxSize) = 0;

			// Computes fade alpha based on distance fade + screen fade (client only)
			virtual unsigned char			ComputeLevelScreenFade(const Vector& vecAbsOrigin, float flRadius, float flFadeScale) const = 0;
			virtual unsigned char			ComputeViewScreenFade(const Vector& vecAbsOrigin, float flRadius, float flFadeScale) const = 0;

			// both client and server
			virtual int						GetAutoplayList(const studiohdr_t* pStudioHdr, unsigned short** pAutoplayList) const = 0;

			// Gets a virtual terrain collision model (creates if necessary)
			// NOTE: This may return NULL if the terrain model cannot be virtualized
			virtual CPhysCollide* GetCollideForVirtualTerrain(int index) = 0;
			virtual bool					IsUsingFBTexture(const model_t* model, int nSkin, int nBody, void /*IClientRenderable*/* pClientRenderable) const = 0;
			virtual const model_t* FindOrLoadModel(const char* name) const = 0;
			virtual MDLHandle_t				GetCacheHandle(const model_t* model) const = 0;
			// Returns planes of non-nodraw brush model surfaces
			virtual int						GetBrushModelPlaneCount(const model_t* model) const = 0;
			virtual void					GetBrushModelPlane(const model_t* model, int nIndex, cplane_t& plane, Vector* pOrigin) const = 0;
			virtual int						GetSurfacepropsForVirtualTerrain(int index) = 0;
			virtual bool					UsesEnvCubemap(const model_t* model) const = 0;
			virtual bool					UsesStaticLighting(const model_t* model) const = 0;
		};

	}

	class IVModelInfoClient : public SourceInterface<SourceEngine::_IVModelInfo_>
	{
	public:
		IVModelInfoClient() {}

		SourceEngine::studiohdr_t* GetStudiomodel(const SourceEngine::model_t* model)
		{
			typedef SourceEngine::studiohdr_t* (__stdcall * oGetStudiomodel)(const SourceEngine::model_t*);
			static oGetStudiomodel oGetStudiomodelFunc;
			if (oGetStudiomodelFunc == 0)
			{
				oGetStudiomodelFunc = VMTManager::Instance()->GetVirtualFunction<oGetStudiomodel>(m_data, 32);
			}
			return oGetStudiomodelFunc(model);
		}

		virtual Interface* Init() override
		{
			m_data = reinterpret_cast<Interface*>(
				Interfaces::Instance()->GetInterfaceAddr("VModelInfoClient")
			);
			SourceInterface<SourceEngine::_IVModelInfo_>::Init();

			return m_data;
		}
	};
}