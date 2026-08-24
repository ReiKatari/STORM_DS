package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux4  reason: default package */
/* loaded from: classes.dex */
public final class ux4 {
    public static final ux4 c = new ux4(0, false);
    public final boolean a;
    public final int b;

    public ux4() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux4)) {
            return false;
        }
        ux4 ux4Var = (ux4) obj;
        if (this.a == ux4Var.a && this.b == ux4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) jt1.a(this.b)) + ')';
    }

    public ux4(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
