package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xk7  reason: default package */
/* loaded from: classes.dex */
public abstract class xk7 extends wk7 {
    public iu4[] a;
    public String b;
    public int c;

    public xk7(xk7 xk7Var) {
        this.a = null;
        this.c = 0;
        this.b = xk7Var.b;
        iu4[] iu4VarArr = xk7Var.a;
        iu4[] iu4VarArr2 = new iu4[iu4VarArr.length];
        for (int i = 0; i < iu4VarArr.length; i++) {
            iu4VarArr2[i] = new iu4(iu4VarArr[i]);
        }
        this.a = iu4VarArr2;
    }

    public iu4[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(iu4[] iu4VarArr) {
        iu4[] iu4VarArr2 = this.a;
        if (iu4VarArr2 != null && iu4VarArr != null && iu4VarArr2.length == iu4VarArr.length) {
            for (int i = 0; i < iu4VarArr2.length; i++) {
                iu4 iu4Var = iu4VarArr2[i];
                char c = iu4Var.a;
                iu4 iu4Var2 = iu4VarArr[i];
                if (c == iu4Var2.a && iu4Var.b.length == iu4Var2.b.length) {
                }
            }
            iu4[] iu4VarArr3 = this.a;
            for (int i2 = 0; i2 < iu4VarArr.length; i2++) {
                iu4VarArr3[i2].a = iu4VarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = iu4VarArr[i2].b;
                    if (i3 < fArr.length) {
                        iu4VarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        iu4[] iu4VarArr4 = new iu4[iu4VarArr.length];
        for (int i4 = 0; i4 < iu4VarArr.length; i4++) {
            iu4VarArr4[i4] = new iu4(iu4VarArr[i4]);
        }
        this.a = iu4VarArr4;
    }

    public xk7() {
        this.a = null;
        this.c = 0;
    }
}
