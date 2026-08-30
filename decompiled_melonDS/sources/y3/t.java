package y3;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14736a;

    /* renamed from: b  reason: collision with root package name */
    public final s f14737b;

    /* renamed from: c  reason: collision with root package name */
    public final s f14738c;

    /* renamed from: d  reason: collision with root package name */
    public final s f14739d;

    /* renamed from: e  reason: collision with root package name */
    public final s f14740e;

    /* renamed from: f  reason: collision with root package name */
    public final Serializable f14741f;

    /* JADX WARN: Multi-variable type inference failed */
    public t(t[] tVarArr) {
        this.f14736a = 0;
        this.f14741f = tVarArr;
        int length = tVarArr.length;
        s[] sVarArr = new s[length];
        for (int i2 = 0; i2 < length; i2++) {
            sVarArr[i2] = ((t[]) this.f14741f)[i2].b();
        }
        this.f14737b = new s(1, new t1(sVarArr, 0));
        int length2 = ((t[]) this.f14741f).length;
        s[] sVarArr2 = new s[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            sVarArr2[i10] = ((t[]) this.f14741f)[i10].d();
        }
        this.f14738c = new s(0, new r(sVarArr2, 0));
        int length3 = ((t[]) this.f14741f).length;
        s[] sVarArr3 = new s[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            sVarArr3[i11] = ((t[]) this.f14741f)[i11].c();
        }
        this.f14739d = new s(1, new t1(sVarArr3, 1));
        int length4 = ((t[]) this.f14741f).length;
        s[] sVarArr4 = new s[length4];
        for (int i12 = 0; i12 < length4; i12++) {
            sVarArr4[i12] = ((t[]) this.f14741f)[i12].a();
        }
        this.f14740e = new s(0, new r(sVarArr4, 1));
    }

    public final s a() {
        switch (this.f14736a) {
            case 0:
                return this.f14740e;
            default:
                return this.f14740e;
        }
    }

    public final s b() {
        switch (this.f14736a) {
            case 0:
                return this.f14737b;
            default:
                return this.f14737b;
        }
    }

    public final s c() {
        switch (this.f14736a) {
            case 0:
                return this.f14739d;
            default:
                return this.f14739d;
        }
    }

    public final s d() {
        switch (this.f14736a) {
            case 0:
                return this.f14738c;
            default:
                return this.f14738c;
        }
    }

    public final String toString() {
        switch (this.f14736a) {
            case 0:
                t[] tVarArr = (t[]) this.f14741f;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (t tVar : tVarArr) {
                    i2++;
                    if (i2 > 1) {
                        sb2.append((CharSequence) ", ");
                    }
                    p7.m.d(sb2, tVar, null);
                }
                sb2.append((CharSequence) ")");
                return sb2.toString();
            default:
                return kc.a.c(')', "RectRulers(", (String) this.f14741f);
        }
    }

    public t(String str) {
        this.f14736a = 1;
        this.f14741f = str;
        this.f14737b = new s(1, null);
        this.f14738c = new s(0, null);
        this.f14739d = new s(1, null);
        this.f14740e = new s(0, null);
    }
}
