package d8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a  reason: collision with root package name */
    public q5.d[] f3979a;

    /* renamed from: b  reason: collision with root package name */
    public String f3980b;

    /* renamed from: c  reason: collision with root package name */
    public int f3981c;

    public l(l lVar) {
        this.f3979a = null;
        this.f3981c = 0;
        this.f3980b = lVar.f3980b;
        q5.d[] dVarArr = lVar.f3979a;
        q5.d[] dVarArr2 = new q5.d[dVarArr.length];
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            dVarArr2[i2] = new q5.d(dVarArr[i2]);
        }
        this.f3979a = dVarArr2;
    }

    public q5.d[] getPathData() {
        return this.f3979a;
    }

    public String getPathName() {
        return this.f3980b;
    }

    public void setPathData(q5.d[] dVarArr) {
        q5.d[] dVarArr2 = this.f3979a;
        if (dVarArr2 != null && dVarArr != null && dVarArr2.length == dVarArr.length) {
            for (int i2 = 0; i2 < dVarArr2.length; i2++) {
                q5.d dVar = dVarArr2[i2];
                char c4 = dVar.f12288a;
                q5.d dVar2 = dVarArr[i2];
                if (c4 == dVar2.f12288a && dVar.f12289b.length == dVar2.f12289b.length) {
                }
            }
            q5.d[] dVarArr3 = this.f3979a;
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                dVarArr3[i10].f12288a = dVarArr[i10].f12288a;
                int i11 = 0;
                while (true) {
                    float[] fArr = dVarArr[i10].f12289b;
                    if (i11 < fArr.length) {
                        dVarArr3[i10].f12289b[i11] = fArr[i11];
                        i11++;
                    }
                }
            }
            return;
        }
        q5.d[] dVarArr4 = new q5.d[dVarArr.length];
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            dVarArr4[i12] = new q5.d(dVarArr[i12]);
        }
        this.f3979a = dVarArr4;
    }

    public l() {
        this.f3979a = null;
        this.f3981c = 0;
    }
}
