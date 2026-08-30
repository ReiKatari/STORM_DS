package me.magnum.melonds;

import java.util.ArrayList;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MelonDSiNand {

    /* renamed from: a  reason: collision with root package name */
    public static final MelonDSiNand f9465a = new Object();

    public final native void closeNand();

    public final native void deleteTitle(int i2);

    public final native boolean exportTitleFile(int i2, int i10, String str);

    public final native int importTitle(String str, byte[] bArr);

    public final native boolean importTitleFile(int i2, int i10, String str);

    public final native ArrayList<DSiWareTitle> listTitles();

    public final native int openNand(EmulatorConfiguration emulatorConfiguration);
}
