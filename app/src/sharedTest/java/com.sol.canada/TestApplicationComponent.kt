package com.sol.canada

import android.content.Context
import com.sol.canada.di.ActivityBuildersModule
import com.sol.canada.di.AppModule
import com.sol.canada.di.SharedPreferenceModule
import com.sol.canada.di.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Modules provides as dependency for test application
 */
@Singleton
@Component(modules = [ViewModelModule::class,AppModule::class,AndroidSupportInjectionModule::class, ActivityBuildersModule::class,SharedPreferenceModule::class, TestNetworkModule::class])
interface TestApplicationComponent :AndroidInjector<TestCountryFactApplication>{
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): TestApplicationComponent
    }
}