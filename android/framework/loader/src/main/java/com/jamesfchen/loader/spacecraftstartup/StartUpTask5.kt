package com.jamesfchen.loader.spacecraftstartup

import android.util.Log
import com.jamesfchen.startup.Job
import com.jamesfchen.startup.Phase
import com.jamesfchen.startup.Process
import com.jamesfchen.startup.RunnablePolicy

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: jamesfchen
 * @since: May/17/2022  Tue
 */
@Job(
    name = "StartUpTask1",
    attachProcesses = [Process.MAIN],
    policy = RunnablePolicy.INSTANT,
    appPhase = Phase.ONCREATE,
    priority = 1,
    deps = []
)
class StartUpTask5 : Runnable {
    override fun run() {
        Log.d("cjf", "StartUpTask1")
    }
}