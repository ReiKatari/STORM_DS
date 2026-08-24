package defpackage;

import android.view.textclassifier.TextClassification;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h07  reason: default package */
/* loaded from: classes.dex */
public final class h07 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public h07(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h07)) {
            return false;
        }
        h07 h07Var = (h07) obj;
        if (nb3.k(this.a, h07Var.a) && k47.b(this.b, h07Var.b) && nb3.k(this.c, h07Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = k47.c;
        int c = i61.c(this.b, this.a.hashCode() * 31, 31);
        hashCode = this.c.hashCode();
        return hashCode + c;
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) k47.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
