#pragma once


namespace Envy
{
	namespace SourceEngine
	{
		struct surfacephysicsparams_t
		{
			float   friction;
			float   elasticity; // collision elasticity - used to compute coefficient of restitution
			float   density;        // physical density (in kg / m^3)
			float   thickness;      // material thickness if not solid (sheet materials) in inches
			float   dampening;
		};
		struct surfaceaudioparams_t
		{
			float   reflectivity;                   // like elasticity, but how much sound should be reflected by this surface
			float   hardnessFactor;                 // like elasticity, but only affects impact sound choices
			float   roughnessFactor;                // like friction, but only affects scrape sound choices
			float   roughThreshold;                 // surface roughness > this causes "rough" scrapes, < this causes "smooth" scrapes
			float   hardThreshold;                  // surface hardness > this causes "hard" impacts, < this causes "soft" impacts
			float   hardVelocityThreshold;  // collision velocity > this causes "hard" impacts, < this causes "soft" impacts       
		};
		struct surfacesoundnames_t
		{
			unsigned short  stepleft;
			unsigned short  stepright;
			unsigned short  impactSoft;
			unsigned short  impactHard;
			unsigned short  scrapeSmooth;
			unsigned short  scrapeRough;
			unsigned short  bulletImpact;
			unsigned short  rolling;
			unsigned short  breakSound;
			unsigned short  strainSound;
		};
		struct surfacegameprops_t
		{
		public:
			char pad02[0xC];
			float maxSpeedFactor;
			float jumpFactor;
			char pad00[0x4];
			float flPenetrationModifier;
			float flDamageModifier;
			unsigned short material;
			char pad01[0x3];

		};
		struct surfacedata_t
		{
			surfacephysicsparams_t	physics;
			surfaceaudioparams_t	audio;
			surfacesoundnames_t		sounds;
			surfacegameprops_t		game;
		};

		class _IPhysicsSurfaceProps_
		{
		public:
			virtual ~_IPhysicsSurfaceProps_(void) {}
			virtual int             ParseSurfaceData(const char *pFilename, const char *pTextfile) = 0;
			virtual int             SurfacePropCount(void) const = 0;
			virtual int             GetSurfaceIndex(const char *pSurfacePropName) const = 0;
			virtual void            GetPhysicsProperties(int surfaceDataIndex, float *density, float *thickness, float *friction, float *elasticity) const = 0;
			virtual surfacedata_t*  GetSurfaceData(int surfaceDataIndex) = 0;
			virtual const char*     GetString(unsigned short stringTableIndex) const = 0;
			virtual const char*     GetPropName(int surfaceDataIndex) const = 0;
			virtual void            SetWorldMaterialIndexTable(int *pMapArray, int mapSize) = 0;
			virtual void            GetPhysicsParameters(int surfaceDataIndex, surfacephysicsparams_t *pParamsOut) const = 0;
		};
	}

	class IPhysicsSurfaceProps : public SourceInterface<SourceEngine::_IPhysicsSurfaceProps_>
	{
	public:
		IPhysicsSurfaceProps() {}

		virtual Interface* Init() override
		{
			m_data = reinterpret_cast<Interface*>(
				Interfaces::Instance()->GetInterfaceAddr("VPhysicsSurfaceProps")
			);
			SourceInterface<SourceEngine::_IPhysicsSurfaceProps_>::Init();
			return m_data;
		}
	};
}