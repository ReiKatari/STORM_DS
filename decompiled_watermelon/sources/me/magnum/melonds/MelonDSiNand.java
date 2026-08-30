package me.magnum.melonds;

import java.util.ArrayList;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MelonDSiNand {
    public static final MelonDSiNand a = new Object();

    public final native void closeNand();

    public final native void deleteTitle(int i);

    public final native boolean exportTitleExecutable(int i, String str);

    public final native boolean exportTitleFile(int i, int i2, String str);

    public final native int importTitle(String str, byte[] bArr);

    public final native boolean importTitleFile(int i, int i2, String str);

    public final native ArrayList<DSiWareTitle> listTitles();

    public final native int openNand(EmulatorConfiguration emulatorConfiguration);
}
