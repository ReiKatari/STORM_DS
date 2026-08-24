package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py0  reason: default package */
/* loaded from: classes.dex */
public final class py0 extends l55 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public py0(qn2 qn2Var) {
        super(new c5(19));
        this.c = new qy0(qn2Var);
    }

    @Override // defpackage.l55
    public final pq a(Object obj) {
        boolean z;
        boolean z2;
        switch (this.b) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                return new pq(this, obj, z, null, true);
            default:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new pq(this, obj, z2, (im6) this.c, true);
        }
    }

    @Override // defpackage.l55
    public nk7 b() {
        switch (this.b) {
            case 0:
                return (qy0) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(on2 on2Var) {
        super(on2Var);
        xd5 xd5Var = xd5.s0;
        this.c = xd5Var;
    }
}
