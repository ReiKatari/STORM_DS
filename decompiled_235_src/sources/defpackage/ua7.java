package defpackage;

import android.graphics.RectF;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua7  reason: default package */
/* loaded from: classes.dex */
public final class ua7 {
    public final String a;
    public final RectF b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ua7(RectF rectF) {
        this(r0, rectF, "");
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
    }

    public static ua7 a(ua7 ua7Var, RectF rectF) {
        String str = ua7Var.a;
        String str2 = ua7Var.c;
        ua7Var.getClass();
        str.getClass();
        str2.getClass();
        return new ua7(str, rectF, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua7)) {
            return false;
        }
        ua7 ua7Var = (ua7) obj;
        if (nb3.k(this.a, ua7Var.a) && nb3.k(this.b, ua7Var.b) && nb3.k(this.c, ua7Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslationRegion(id=");
        sb.append(this.a);
        sb.append(", rect=");
        sb.append(this.b);
        sb.append(", name=");
        return i61.n(sb, this.c, ")");
    }

    public ua7(String str, RectF rectF, String str2) {
        this.a = str;
        this.b = rectF;
        this.c = str2;
    }
}
