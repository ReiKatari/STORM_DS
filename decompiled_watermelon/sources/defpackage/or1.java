package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: or1  reason: default package */
/* loaded from: classes.dex */
public final class or1 extends k11 {
    public js5 R;
    public int X;
    public int Y;
    public int Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ EmulatorActivity d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or1(EmulatorActivity emulatorActivity, k11 k11Var) {
        super(k11Var);
        this.d0 = emulatorActivity;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.c0 = obj;
        this.e0 |= Integer.MIN_VALUE;
        return EmulatorActivity.B(this.d0, this);
    }
}
