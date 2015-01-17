package com.linroid.radio.module;


import com.linroid.radio.ui.HomeActivity;
import com.linroid.radio.ui.fragment.AlbumListFragment;
import com.linroid.radio.ui.fragment.AnchorListFragment;
import com.linroid.radio.ui.fragment.PlayerFragment;
import com.linroid.radio.ui.fragment.ProgramListFragment;

import dagger.Module;

@Module(
        addsTo = AppModule.class,
        complete = false,
        injects = {
                HomeActivity.class,
                ProgramListFragment.class,
                PlayerFragment.class,
                AlbumListFragment.class,
                AnchorListFragment.class
        }
)
public class HomeModule {
    HomeActivity activity;

    public HomeModule(HomeActivity activity) {
        this.activity = activity;
    }

//    @Provides
//    @Singleton
//    public PostAdapter providePostAdapter() {
//        PostAdapter localPostAdapter = new PostAdapter(null);
//        return localPostAdapter;
//    }
}

/* Location:           /home/linroid/Tmp/Alwen/classes-dex2jar.jar
 * Qualified Name:     com.linroid.alwen.module.HomeModule
 * JD-Core Version:    0.6.2
 */