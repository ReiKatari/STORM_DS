package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wy1  reason: default package */
/* loaded from: classes.dex */
public final class wy1 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ ti4 Z;
    public final /* synthetic */ hv1 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy1(int i, j11 j11Var, hv1 hv1Var) {
        super(3, j11Var);
        this.X = i;
        this.c0 = hv1Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        hv1 hv1Var = this.c0;
        ti4 ti4Var = (ti4) obj;
        o27 o27Var2 = (o27) obj2;
        j11 j11Var = (j11) obj3;
        switch (i) {
            case 0:
                wy1 wy1Var = new wy1(0, j11Var, hv1Var);
                wy1Var.Z = ti4Var;
                return wy1Var.v(o27Var);
            default:
                wy1 wy1Var2 = new wy1(1, j11Var, hv1Var);
                wy1Var2.Z = ti4Var;
                return wy1Var2.v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        k17 k17Var;
        k17 k17Var2;
        int i = this.X;
        hv1 hv1Var = this.c0;
        switch (i) {
            case 0:
                ti4 ti4Var = this.Z;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    if (ti4Var != null) {
                        k17Var = (k17) ti4Var.B;
                    } else {
                        k17Var = null;
                    }
                    if (k17Var == null) {
                        return bs5.c;
                    }
                    mv5 mv5Var = k17Var.a;
                    UUID uuid = mv5Var.a;
                    BackgroundMode backgroundMode = mv5Var.b;
                    this.Z = null;
                    this.Y = 1;
                    obj = hv1.J(hv1Var, uuid, backgroundMode, this);
                    if (obj == p31Var) {
                        return p31Var;
                    }
                }
                return (bs5) obj;
            default:
                ti4 ti4Var2 = this.Z;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    if (ti4Var2 != null) {
                        k17Var2 = (k17) ti4Var2.B;
                    } else {
                        k17Var2 = null;
                    }
                    if (k17Var2 == null) {
                        return bs5.c;
                    }
                    mv5 mv5Var2 = k17Var2.b;
                    UUID uuid2 = mv5Var2.a;
                    BackgroundMode backgroundMode2 = mv5Var2.b;
                    this.Z = null;
                    this.Y = 1;
                    obj = hv1.J(hv1Var, uuid2, backgroundMode2, this);
                    if (obj == p31Var2) {
                        return p31Var2;
                    }
                }
                return (bs5) obj;
        }
    }
}
