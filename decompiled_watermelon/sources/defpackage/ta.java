package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ta  reason: default package */
/* loaded from: classes.dex */
public final class ta {
    public final /* synthetic */ int a;

    public final Object a(b1 b1Var) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.a) {
            case 0:
                pa paVar = (pa) b1Var;
                x70 p = paVar.p();
                int size = p.size();
                if (size == 0) {
                    bArr = s33.b;
                } else {
                    byte[] bArr3 = new byte[size];
                    p.i(size, bArr3);
                    bArr = bArr3;
                }
                return new ma(bArr, sn2.R(paVar.q().p()), paVar.q().o(), sn2.R(paVar.q().q().n()), paVar.q().q().o(), paVar.q().m());
            default:
                db dbVar = (db) b1Var;
                x70 p2 = dbVar.p();
                int size2 = p2.size();
                if (size2 == 0) {
                    bArr2 = s33.b;
                } else {
                    byte[] bArr4 = new byte[size2];
                    p2.i(size2, bArr4);
                    bArr2 = bArr4;
                }
                return new ab(dbVar.q().r(), dbVar.q().p(), sn2.R(dbVar.q().s()), bArr2);
        }
    }
}
