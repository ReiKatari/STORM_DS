package me.magnum.melonds;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonDSiNand {
    public static final me.magnum.melonds.MelonDSiNand a = null;

    static {
            me.magnum.melonds.MelonDSiNand r0 = new me.magnum.melonds.MelonDSiNand
            r0.<init>()
            me.magnum.melonds.MelonDSiNand.a = r0
            return
    }

    public final native void closeNand();

    public final native void deleteTitle(int r1);

    public final native boolean exportTitleExecutable(int r1, java.lang.String r2);

    public final native boolean exportTitleFile(int r1, int r2, java.lang.String r3);

    public final native int importTitle(java.lang.String r1, byte[] r2);

    public final native boolean importTitleFile(int r1, int r2, java.lang.String r3);

    public final native java.util.ArrayList<me.magnum.melonds.domain.model.DSiWareTitle> listTitles();

    public final native int openNand(me.magnum.melonds.domain.model.EmulatorConfiguration r1);

    public final native boolean repairTitleSaves(int r1);
}
