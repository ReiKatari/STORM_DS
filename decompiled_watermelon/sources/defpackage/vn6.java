package defpackage;

import android.view.textclassifier.TextClassification;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vn6  reason: default package */
/* loaded from: classes.dex */
public final class vn6 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public vn6(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn6)) {
            return false;
        }
        vn6 vn6Var = (vn6) obj;
        if (b53.x(this.a, vn6Var.a) && vr6.b(this.b, vn6Var.b) && b53.x(this.c, vn6Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = vr6.c;
        int c = b31.c(this.b, this.a.hashCode() * 31, 31);
        hashCode = this.c.hashCode();
        return hashCode + c;
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) vr6.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
