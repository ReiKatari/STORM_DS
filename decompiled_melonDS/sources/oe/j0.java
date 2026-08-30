package oe;

import android.net.Uri;
import java.util.Date;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f10942a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10943b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f10944c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f10945d;

    public j0(int i2, boolean z10, Date date, Uri uri) {
        this.f10942a = i2;
        this.f10943b = z10;
        this.f10944c = date;
        this.f10945d = uri;
    }

    public static j0 a(j0 j0Var, Uri uri) {
        return new j0(j0Var.f10942a, j0Var.f10943b, j0Var.f10944c, uri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f10942a == j0Var.f10942a && this.f10943b == j0Var.f10943b && nc.k.a(this.f10944c, j0Var.f10944c) && nc.k.a(this.f10945d, j0Var.f10945d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e6 = w.d.e(Integer.hashCode(this.f10942a) * 31, this.f10943b, 31);
        int i2 = 0;
        Date date = this.f10944c;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i10 = (e6 + hashCode) * 31;
        Uri uri = this.f10945d;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return i10 + i2;
    }

    public final String toString() {
        return "SaveStateSlot(slot=" + this.f10942a + ", exists=" + this.f10943b + ", lastUsedDate=" + this.f10944c + ", screenshot=" + this.f10945d + ")";
    }
}
