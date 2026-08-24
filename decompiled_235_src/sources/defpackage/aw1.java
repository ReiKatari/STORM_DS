package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aw1  reason: default package */
/* loaded from: classes.dex */
public final class aw1 extends s41 {
    public b36 R;
    public int X;
    public int Y;
    public int Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ EmulatorActivity e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw1(EmulatorActivity emulatorActivity, s41 s41Var) {
        super(s41Var);
        this.e0 = emulatorActivity;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.d0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        return EmulatorActivity.B(this.e0, this);
    }
}
