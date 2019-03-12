package delta.common.framework.jobs;

/**
 * Job result.
 * @param <T> Type of result.
 * @author DAM
 */
public class JobResult<T>
{
  private T _result;

  /**
   * Constructor.
   */
  public JobResult()
  {
    // Nothing!
  }

  /**
   * Get the job result.
   * @return a result or <code>null</code> if not set.
   */
  public T getResult()
  {
    return _result;
  }

  /**
   * Set the job result.
   * @param result Result to set (mayb be <code>null</code>).
   */
  public void setResult(T result)
  {
    _result=result;
  }
}
