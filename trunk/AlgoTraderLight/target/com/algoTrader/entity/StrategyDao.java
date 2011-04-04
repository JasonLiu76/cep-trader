// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package com.algoTrader.entity;

/**
 * @see com.algoTrader.entity.Strategy
 */
public interface StrategyDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p/>
     * This specific flag denotes no transformation will occur.
     */
    public final static int TRANSFORM_NONE = 0;

    /**
     * Loads an instance of com.algoTrader.entity.Strategy from the persistent store.
     */
    public com.algoTrader.entity.Strategy load(int id);

    /**
     * <p>
     * Does the same thing as {@link #load(int)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, int id);

    /**
     * Loads all entities of type {@link com.algoTrader.entity.Strategy}.
     *
     * @return the loaded entities.
     */
    public java.util.Collection loadAll();

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform);

    /**
     * Creates an instance of com.algoTrader.entity.Strategy and adds it to the persistent store.
     */
    public com.algoTrader.entity.Strategy create(com.algoTrader.entity.Strategy strategy);

    /**
     * <p>
     * Does the same thing as {@link #create(com.algoTrader.entity.Strategy)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(int transform, com.algoTrader.entity.Strategy strategy);

    /**
     * Creates a new instance of com.algoTrader.entity.Strategy and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of com.algoTrader.entity.Strategy
     * instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     * Does the same thing as {@link #create(com.algoTrader.entity.Strategy)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public java.util.Collection create(int transform, java.util.Collection entities);

    /**
     * <p>
     * Creates a new <code>com.algoTrader.entity.Strategy</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     */
    public com.algoTrader.entity.Strategy create(
        java.lang.String name,
        boolean autoActivate,
        double allocation,
        java.lang.String modules);

    /**
     * <p>
     * Does the same thing as {@link #create(java.lang.String, boolean, double, java.lang.String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.lang.String name,
        boolean autoActivate,
        double allocation,
        java.lang.String modules);


    /**
     * Updates the <code>strategy</code> instance in the persistent store.
     */
    public void update(com.algoTrader.entity.Strategy strategy);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of com.algoTrader.entity.Strategy from the persistent store.
     */
    public void remove(com.algoTrader.entity.Strategy strategy);

    /**
     * Removes the instance of com.algoTrader.entity.Strategy having the given
     * <code>identifier</code> from the persistent store.
     */
    public void remove(int id);

    /**
     * Removes all entities in the given <code>entities<code> collection.
     */
    public void remove(java.util.Collection entities);

    /**
 * 
     */
    public com.algoTrader.entity.Strategy findByName(java.lang.String name);

    /**
     * <p>
     * Does the same thing as {@link #findByName(java.lang.String)} with an
     * additional argument called <code>queryString</code>. This <code>queryString</code>
     * argument allows you to override the query string defined in {@link #findByName(java.lang.String)}.
     * </p>
     */
    public com.algoTrader.entity.Strategy findByName(String queryString, java.lang.String name);

    /**
     * <p>
     * Does the same thing as {@link #findByName(java.lang.String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object findByName(int transform, java.lang.String name);

    /**
     * <p>
     * Does the same thing as {@link #findByName(boolean, java.lang.String)} with an
     * additional argument called <code>queryString</code>. This <code>queryString</code>
     * argument allows you to override the query string defined in {@link #findByName(int, java.lang.String name)}.
     * </p>
     */
    public Object findByName(int transform, String queryString, java.lang.String name);

    /**
 * 
     */
    public com.algoTrader.entity.Strategy findByNameFetched(java.lang.String name);

    /**
     * <p>
     * Does the same thing as {@link #findByNameFetched(java.lang.String)} with an
     * additional argument called <code>queryString</code>. This <code>queryString</code>
     * argument allows you to override the query string defined in {@link #findByNameFetched(java.lang.String)}.
     * </p>
     */
    public com.algoTrader.entity.Strategy findByNameFetched(String queryString, java.lang.String name);

    /**
     * <p>
     * Does the same thing as {@link #findByNameFetched(java.lang.String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object findByNameFetched(int transform, java.lang.String name);

    /**
     * <p>
     * Does the same thing as {@link #findByNameFetched(boolean, java.lang.String)} with an
     * additional argument called <code>queryString</code>. This <code>queryString</code>
     * argument allows you to override the query string defined in {@link #findByNameFetched(int, java.lang.String name)}.
     * </p>
     */
    public Object findByNameFetched(int transform, String queryString, java.lang.String name);

    /**
 * 
     */
    public java.util.List findAutoActivateStrategies();

    /**
     * <p>
     * Does the same thing as {@link #findAutoActivateStrategies()} with an
     * additional argument called <code>queryString</code>. This <code>queryString</code>
     * argument allows you to override the query string defined in {@link #findAutoActivateStrategies()}.
     * </p>
     */
    public java.util.List findAutoActivateStrategies(String queryString);

    /**
     * <p>
     * Does the same thing as {@link #findAutoActivateStrategies()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public java.util.List findAutoActivateStrategies(int transform);

    /**
     * <p>
     * Does the same thing as {@link #findAutoActivateStrategies(boolean)} with an
     * additional argument called <code>queryString</code>. This <code>queryString</code>
     * argument allows you to override the query string defined in {@link #findAutoActivateStrategies(int)}.
     * </p>
     */
    public java.util.List findAutoActivateStrategies(int transform, String queryString);

    /**
 * 
     */
    public double getPortfolioCashBalanceDouble();

    /**
 * 
     */
    public double getPortfolioSecuritiesCurrentValueDouble();

    /**
 * 
     */
    public double getPortfolioMaintenanceMarginDouble();

    /**
 * 
     */
    public double getPortfolioInitialMarginDouble();

    /**
 * 
     */
    public double getPortfolioNetLiqValueDouble();

    /**
 * 
     */
    public double getPortfolioAvailableFundsDouble();

}
