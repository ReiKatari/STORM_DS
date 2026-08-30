package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yw  reason: default package */
/* loaded from: classes.dex */
public final class yw {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public yw(int i, String str, int i2, int i3, int i4, int i5) {
        this.a = i;
        if (str != null) {
            this.b = str;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            return;
        }
        c44.i("Null mediaType");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yw) {
            yw ywVar = (yw) obj;
            if (this.a == ywVar.a && this.b.equals(ywVar.b) && this.c == ywVar.c && this.d == ywVar.d && this.e == ywVar.e && this.f == ywVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channels=");
        sb.append(this.e);
        sb.append(", profile=");
        return wh1.m(sb, this.f, "}");
    }
}
