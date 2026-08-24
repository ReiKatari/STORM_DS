package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g32  reason: default package */
/* loaded from: classes.dex */
public final class g32 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ vr4 Z;
    public final /* synthetic */ sz1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g32(int i, r41 r41Var, sz1 sz1Var) {
        super(3, r41Var);
        this.X = i;
        this.d0 = sz1Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        sz1 sz1Var = this.d0;
        vr4 vr4Var = (vr4) obj;
        jg7 jg7Var2 = (jg7) obj2;
        r41 r41Var = (r41) obj3;
        switch (i) {
            case 0:
                g32 g32Var = new g32(0, r41Var, sz1Var);
                g32Var.Z = vr4Var;
                return g32Var.s(jg7Var);
            default:
                g32 g32Var2 = new g32(1, r41Var, sz1Var);
                g32Var2.Z = vr4Var;
                return g32Var2.s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        ff7 ff7Var;
        ff7 ff7Var2;
        int i = this.X;
        sz1 sz1Var = this.d0;
        switch (i) {
            case 0:
                vr4 vr4Var = this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (vr4Var != null) {
                        ff7Var = (ff7) vr4Var.B;
                    } else {
                        ff7Var = null;
                    }
                    if (ff7Var == null) {
                        return t26.c;
                    }
                    z66 z66Var = ff7Var.a;
                    UUID uuid = z66Var.a;
                    BackgroundMode backgroundMode = z66Var.b;
                    this.Z = null;
                    this.Y = 1;
                    obj = sz1.G(sz1Var, uuid, backgroundMode, this);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return (t26) obj;
            default:
                vr4 vr4Var2 = this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (vr4Var2 != null) {
                        ff7Var2 = (ff7) vr4Var2.B;
                    } else {
                        ff7Var2 = null;
                    }
                    if (ff7Var2 == null) {
                        return t26.c;
                    }
                    z66 z66Var2 = ff7Var2.b;
                    UUID uuid2 = z66Var2.a;
                    BackgroundMode backgroundMode2 = z66Var2.b;
                    this.Z = null;
                    this.Y = 1;
                    obj = sz1.G(sz1Var, uuid2, backgroundMode2, this);
                    if (obj == x61Var2) {
                        return x61Var2;
                    }
                }
                return (t26) obj;
        }
    }
}
