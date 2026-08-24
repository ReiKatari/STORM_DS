package defpackage;

import android.graphics.RectF;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ta7  reason: default package */
/* loaded from: classes.dex */
public final class ta7 {
    public final String a;
    public String b;
    public final RectF c;
    public final int d;
    public final int e;

    public ta7(String str, String str2, RectF rectF, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = rectF;
        this.d = i;
        this.e = i2;
    }

    public static ta7 a(ta7 ta7Var, String str, RectF rectF, int i) {
        if ((i & 1) != 0) {
            str = ta7Var.a;
        }
        String str2 = str;
        String str3 = ta7Var.b;
        int i2 = ta7Var.d;
        int i3 = ta7Var.e;
        str2.getClass();
        str3.getClass();
        return new ta7(str2, str3, rectF, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ta7) {
            ta7 ta7Var = (ta7) obj;
            if (nb3.k(this.a, ta7Var.a) && nb3.k(this.b, ta7Var.b) && this.c.equals(ta7Var.c) && this.d == ta7Var.d && this.e == ta7Var.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int d = xg6.d(this.a.hashCode() * 31, 31, this.b);
        return Boolean.hashCode(false) + lb1.a(this.e, lb1.a(this.d, (this.c.hashCode() + d) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("TranslatedTextBlock(originalText=", this.a, ", translatedText=", this.b, ", boundingBox=");
        u.append(this.c);
        u.append(", backgroundColor=");
        u.append(this.d);
        u.append(", textColor=");
        return lb1.o(u, this.e, ", isShowingOriginal=false)");
    }
}
