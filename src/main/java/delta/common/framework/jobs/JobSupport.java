package delta.common.framework.jobs;

/**
 * Support for job implementations.
 * @author DAM
 */
public interface JobSupport
{
  /**
   * Update the label for the job.
   * @param label Label to set.
   */
  public void updateLabel(String label);

  /**
   * Update the completion status for the job.
   */
  public void updateCompletionStatus();
}
