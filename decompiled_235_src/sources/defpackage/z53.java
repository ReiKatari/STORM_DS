package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z53  reason: default package */
/* loaded from: classes.dex */
public final class z53 {
    public final /* synthetic */ int a;
    public final hy2 b;
    public final hy2 c;
    public final hy2 d;
    public final hy2 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public z53(z53[] z53VarArr) {
        this.a = 0;
        this.f = z53VarArr;
        int length = z53VarArr.length;
        hy2[] hy2VarArr = new hy2[length];
        for (int i = 0; i < length; i++) {
            hy2VarArr[i] = ((z53[]) this.f)[i].b();
        }
        this.b = new hy2(1, new im7(hy2VarArr, 0));
        int length2 = ((z53[]) this.f).length;
        hy2[] hy2VarArr2 = new hy2[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            hy2VarArr2[i2] = ((z53[]) this.f)[i2].d();
        }
        this.c = new hy2(0, new gy2(hy2VarArr2, 0));
        int length3 = ((z53[]) this.f).length;
        hy2[] hy2VarArr3 = new hy2[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            hy2VarArr3[i3] = ((z53[]) this.f)[i3].c();
        }
        this.d = new hy2(1, new im7(hy2VarArr3, 1));
        int length4 = ((z53[]) this.f).length;
        hy2[] hy2VarArr4 = new hy2[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            hy2VarArr4[i4] = ((z53[]) this.f)[i4].a();
        }
        this.e = new hy2(0, new gy2(hy2VarArr4, 1));
    }

    public final hy2 a() {
        int i = this.a;
        return this.e;
    }

    public final hy2 b() {
        int i = this.a;
        return this.b;
    }

    public final hy2 c() {
        int i = this.a;
        return this.d;
    }

    public final hy2 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                return fv.M0((z53[]) serializable, "innermostOf(", ")", null, 57);
            default:
                return i61.k(')', "RectRulers(", (String) serializable);
        }
    }

    public z53(String str) {
        this.a = 1;
        this.f = str;
        this.b = new hy2(1, null);
        this.c = new hy2(0, null);
        this.d = new hy2(1, null);
        this.e = new hy2(0, null);
    }
}
