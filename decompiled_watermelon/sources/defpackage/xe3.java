package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xe3  reason: default package */
/* loaded from: classes.dex */
public final class xe3 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ bf3 Z;
    public final /* synthetic */ UUID c0;
    public final /* synthetic */ BackgroundMode d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe3(bf3 bf3Var, UUID uuid, BackgroundMode backgroundMode, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = bf3Var;
        this.c0 = uuid;
        this.d0 = backgroundMode;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((xe3) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((xe3) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new xe3(this.Z, this.c0, this.d0, j11Var, 0);
            default:
                return new xe3(this.Z, this.c0, this.d0, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        BackgroundMode backgroundMode = this.d0;
        UUID uuid = this.c0;
        bf3 bf3Var = this.Z;
        switch (i) {
            case 0:
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
                    z33 z33Var = bf3Var.c;
                    this.Y = 1;
                    obj = z33Var.c(uuid, this);
                    if (obj == p31Var) {
                        return p31Var;
                    }
                }
                ee6 ee6Var = bf3Var.k;
                bs5 bs5Var = new bs5((vy) obj, backgroundMode);
                ee6Var.getClass();
                ee6Var.l(null, bs5Var);
                return o27Var;
            default:
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
                    z33 z33Var2 = bf3Var.c;
                    this.Y = 1;
                    obj = z33Var2.c(uuid, this);
                    if (obj == p31Var2) {
                        return p31Var2;
                    }
                }
                ee6 ee6Var2 = bf3Var.m;
                bs5 bs5Var2 = new bs5((vy) obj, backgroundMode);
                ee6Var2.getClass();
                ee6Var2.l(null, bs5Var2);
                return o27Var;
        }
    }
}
