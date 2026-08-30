package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wz2  reason: default package */
/* loaded from: classes.dex */
public final class wz2 {
    public final /* synthetic */ int a;
    public final gs2 b;
    public final gs2 c;
    public final gs2 d;
    public final gs2 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public wz2(wz2[] wz2VarArr) {
        this.a = 0;
        this.f = wz2VarArr;
        int length = wz2VarArr.length;
        gs2[] gs2VarArr = new gs2[length];
        for (int i = 0; i < length; i++) {
            gs2VarArr[i] = ((wz2[]) this.f)[i].b();
        }
        this.b = new gs2(1, new j87(gs2VarArr, 0));
        int length2 = ((wz2[]) this.f).length;
        gs2[] gs2VarArr2 = new gs2[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            gs2VarArr2[i2] = ((wz2[]) this.f)[i2].d();
        }
        this.c = new gs2(0, new fs2(gs2VarArr2, 0));
        int length3 = ((wz2[]) this.f).length;
        gs2[] gs2VarArr3 = new gs2[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            gs2VarArr3[i3] = ((wz2[]) this.f)[i3].c();
        }
        this.d = new gs2(1, new j87(gs2VarArr3, 1));
        int length4 = ((wz2[]) this.f).length;
        gs2[] gs2VarArr4 = new gs2[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            gs2VarArr4[i4] = ((wz2[]) this.f)[i4].a();
        }
        this.e = new gs2(0, new fs2(gs2VarArr4, 1));
    }

    public final gs2 a() {
        int i = this.a;
        return this.e;
    }

    public final gs2 b() {
        int i = this.a;
        return this.b;
    }

    public final gs2 c() {
        int i = this.a;
        return this.d;
    }

    public final gs2 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                return nu.y0((wz2[]) serializable, "innermostOf(", ")", null, 57);
            default:
                return b31.n(')', "RectRulers(", (String) serializable);
        }
    }

    public wz2(String str) {
        this.a = 1;
        this.f = str;
        this.b = new gs2(1, null);
        this.c = new gs2(0, null);
        this.d = new gs2(1, null);
        this.e = new gs2(0, null);
    }
}
