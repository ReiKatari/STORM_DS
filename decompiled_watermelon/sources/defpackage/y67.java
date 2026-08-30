package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y67  reason: default package */
/* loaded from: classes.dex */
public abstract class y67 extends x67 {
    public gl4[] a;
    public String b;
    public int c;

    public y67(y67 y67Var) {
        this.a = null;
        this.c = 0;
        this.b = y67Var.b;
        gl4[] gl4VarArr = y67Var.a;
        gl4[] gl4VarArr2 = new gl4[gl4VarArr.length];
        for (int i = 0; i < gl4VarArr.length; i++) {
            gl4VarArr2[i] = new gl4(gl4VarArr[i]);
        }
        this.a = gl4VarArr2;
    }

    public gl4[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(gl4[] gl4VarArr) {
        gl4[] gl4VarArr2 = this.a;
        if (gl4VarArr2 != null && gl4VarArr != null && gl4VarArr2.length == gl4VarArr.length) {
            for (int i = 0; i < gl4VarArr2.length; i++) {
                gl4 gl4Var = gl4VarArr2[i];
                char c = gl4Var.a;
                gl4 gl4Var2 = gl4VarArr[i];
                if (c == gl4Var2.a && gl4Var.b.length == gl4Var2.b.length) {
                }
            }
            gl4[] gl4VarArr3 = this.a;
            for (int i2 = 0; i2 < gl4VarArr.length; i2++) {
                gl4VarArr3[i2].a = gl4VarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = gl4VarArr[i2].b;
                    if (i3 < fArr.length) {
                        gl4VarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        gl4[] gl4VarArr4 = new gl4[gl4VarArr.length];
        for (int i4 = 0; i4 < gl4VarArr.length; i4++) {
            gl4VarArr4[i4] = new gl4(gl4VarArr[i4]);
        }
        this.a = gl4VarArr4;
    }

    public y67() {
        this.a = null;
        this.c = 0;
    }
}
