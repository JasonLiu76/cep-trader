// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package com.algoTrader.service;

/**
 * <p>
 * Spring Service base class for <code>com.algoTrader.service.PositionService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see com.algoTrader.service.PositionService
 */
public abstract class PositionServiceBase
    implements com.algoTrader.service.PositionService
{

    private com.algoTrader.service.RuleService ruleService;

    /**
     * Sets the reference to <code>ruleService</code>.
     */
    public void setRuleService(com.algoTrader.service.RuleService ruleService)
    {
        this.ruleService = ruleService;
    }

    /**
     * Gets the reference to <code>ruleService</code>.
     */
    protected com.algoTrader.service.RuleService getRuleService()
    {
        return this.ruleService;
    }

    private com.algoTrader.service.TickService tickService;

    /**
     * Sets the reference to <code>tickService</code>.
     */
    public void setTickService(com.algoTrader.service.TickService tickService)
    {
        this.tickService = tickService;
    }

    /**
     * Gets the reference to <code>tickService</code>.
     */
    protected com.algoTrader.service.TickService getTickService()
    {
        return this.tickService;
    }

    private com.algoTrader.service.TransactionService transactionService;

    /**
     * Sets the reference to <code>transactionService</code>.
     */
    public void setTransactionService(com.algoTrader.service.TransactionService transactionService)
    {
        this.transactionService = transactionService;
    }

    /**
     * Gets the reference to <code>transactionService</code>.
     */
    protected com.algoTrader.service.TransactionService getTransactionService()
    {
        return this.transactionService;
    }

    private com.algoTrader.entity.PositionDao positionDao;

    /**
     * Sets the reference to <code>position</code>'s DAO.
     */
    public void setPositionDao(com.algoTrader.entity.PositionDao positionDao)
    {
        this.positionDao = positionDao;
    }

    /**
     * Gets the reference to <code>position</code>'s DAO.
     */
    protected com.algoTrader.entity.PositionDao getPositionDao()
    {
        return this.positionDao;
    }

    /**
     * @see com.algoTrader.service.PositionService#closePosition(int)
     */
    public void closePosition(int positionId)
    {
        try
        {
            this.handleClosePosition(positionId);
        }
        catch (Throwable th)
        {
            throw new com.algoTrader.service.PositionServiceException(
                "Error performing 'com.algoTrader.service.PositionService.closePosition(int positionId)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #closePosition(int)}
      */
    protected abstract void handleClosePosition(int positionId)
        throws java.lang.Exception;

    /**
     * @see com.algoTrader.service.PositionService#reducePosition(int, long)
     */
    public void reducePosition(int positionId, long quantity)
    {
        try
        {
            this.handleReducePosition(positionId, quantity);
        }
        catch (Throwable th)
        {
            throw new com.algoTrader.service.PositionServiceException(
                "Error performing 'com.algoTrader.service.PositionService.reducePosition(int positionId, long quantity)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #reducePosition(int, long)}
      */
    protected abstract void handleReducePosition(int positionId, long quantity)
        throws java.lang.Exception;

    /**
     * @see com.algoTrader.service.PositionService#setExitValue(int, double, boolean)
     */
    public void setExitValue(int positionId, double exitValue, boolean force)
    {
        try
        {
            this.handleSetExitValue(positionId, exitValue, force);
        }
        catch (Throwable th)
        {
            throw new com.algoTrader.service.PositionServiceException(
                "Error performing 'com.algoTrader.service.PositionService.setExitValue(int positionId, double exitValue, boolean force)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #setExitValue(int, double, boolean)}
      */
    protected abstract void handleSetExitValue(int positionId, double exitValue, boolean force)
        throws java.lang.Exception;

    /**
     * @see com.algoTrader.service.PositionService#setMargins()
     */
    public void setMargins()
    {
        try
        {
            this.handleSetMargins();
        }
        catch (Throwable th)
        {
            throw new com.algoTrader.service.PositionServiceException(
                "Error performing 'com.algoTrader.service.PositionService.setMargins()' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #setMargins()}
      */
    protected abstract void handleSetMargins()
        throws java.lang.Exception;

    /**
     * @see com.algoTrader.service.PositionService#setMargin(int)
     */
    public void setMargin(int positionId)
    {
        try
        {
            this.handleSetMargin(positionId);
        }
        catch (Throwable th)
        {
            throw new com.algoTrader.service.PositionServiceException(
                "Error performing 'com.algoTrader.service.PositionService.setMargin(int positionId)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #setMargin(int)}
      */
    protected abstract void handleSetMargin(int positionId)
        throws java.lang.Exception;

    /**
     * @see com.algoTrader.service.PositionService#setMargin(com.algoTrader.entity.Position)
     */
    public void setMargin(com.algoTrader.entity.Position position)
    {
        if (position == null)
        {
            throw new IllegalArgumentException(
                "com.algoTrader.service.PositionService.setMargin(com.algoTrader.entity.Position position) - 'position' can not be null");
        }
        try
        {
            this.handleSetMargin(position);
        }
        catch (Throwable th)
        {
            throw new com.algoTrader.service.PositionServiceException(
                "Error performing 'com.algoTrader.service.PositionService.setMargin(com.algoTrader.entity.Position position)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #setMargin(com.algoTrader.entity.Position)}
      */
    protected abstract void handleSetMargin(com.algoTrader.entity.Position position)
        throws java.lang.Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return com.algoTrader.PrincipalStore.get();
    }
}