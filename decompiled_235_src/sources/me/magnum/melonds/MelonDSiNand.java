package me.magnum.melonds;

import java.util.ArrayList;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
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

    public final native boolean repairTitleSaves(int i);
}
