package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tv0  reason: default package */
/* loaded from: classes.dex */
public final class tv0 extends ew4 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public tv0(mi2 mi2Var) {
        super(new d5(19));
        this.c = new uv0(mi2Var);
    }

    @Override // defpackage.ew4
    public final dq a(Object obj) {
        boolean z;
        boolean z2;
        switch (this.b) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                return new dq(this, obj, z, null, true);
            default:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new dq(this, obj, z2, (ta6) this.c, true);
        }
    }

    @Override // defpackage.ew4
    public o67 b() {
        switch (this.b) {
            case 0:
                return (uv0) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv0(ki2 ki2Var) {
        super(ki2Var);
        k45 k45Var = k45.n0;
        this.c = k45Var;
    }
}
