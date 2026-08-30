package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qo4  reason: default package */
/* loaded from: classes.dex */
public final class qo4 {
    public static final qo4 c = new qo4(0, false);
    public final boolean a;
    public final int b;

    public qo4() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo4)) {
            return false;
        }
        qo4 qo4Var = (qo4) obj;
        if (this.a == qo4Var.a && this.b == qo4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) ap1.a(this.b)) + ')';
    }

    public qo4(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
