package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gd5  reason: default package */
/* loaded from: classes.dex */
public final class gd5 extends nk6 implements mi2 {
    public int X;
    public final /* synthetic */ hd5 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ArrayList c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd5(hd5 hd5Var, long j, ArrayList arrayList, j11 j11Var) {
        super(1, j11Var);
        this.Y = hd5Var;
        this.Z = j;
        this.c0 = arrayList;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        long j = this.Z;
        ArrayList arrayList = this.c0;
        return new gd5(this.Y, j, arrayList, (j11) obj).v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            this.X = 1;
            if (bd5.J(this.Y, this.Z, this.c0, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
