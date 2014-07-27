package co.touchlab.droidconandroid.tasks

import co.touchlab.android.threading.tasks.TaskQueue
import co.touchlab.droidconandroid.data.DatabaseHelper
import android.content.Context

/**
 * Created by kgalligan on 7/21/14.
 */
abstract class DatabaseTaskKot(c: Context) : TaskQueue.Task
{
    val databaseHelper: DatabaseHelper = DatabaseHelper.getInstance(c)
}