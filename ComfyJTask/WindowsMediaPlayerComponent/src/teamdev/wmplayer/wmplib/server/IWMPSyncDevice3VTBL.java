package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPSyncDevice3.
 */
public class IWMPSyncDevice3VTBL extends IWMPSyncDevice2VTBL {
    public IWMPSyncDevice3VTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "estimateSyncSize",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl(),
                                        new IWMPPlaylistImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "cancelEstimation",
                                new HResult(),
                                new Parameter[]{
                                }
                        )
                }
        );
    }
}