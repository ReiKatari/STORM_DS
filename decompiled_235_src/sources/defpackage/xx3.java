package defpackage;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx3  reason: default package */
/* loaded from: classes.dex */
public final class xx3 {
    public final String a;
    public final String b;
    public final String c;
    public final File d;
    public final float e;

    public xx3(String str, String str2, String str3, File file, float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = file;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xx3) {
                xx3 xx3Var = (xx3) obj;
                if (!this.a.equals(xx3Var.a) || !this.b.equals(xx3Var.b) || !this.c.equals(xx3Var.c) || !nb3.k(this.d, xx3Var.d) || Float.compare(this.e, xx3Var.e) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int d = xg6.d((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 108812813) * 31, 31, this.c);
        File file = this.d;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        return Float.hashCode(this.e) + xg6.e((d + hashCode) * 31, true, 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("VoiceModelPack(id=", this.a, ", displayName=", this.b, ", language=ru-RU, gender=");
        u.append(this.c);
        u.append(", modelFile=");
        u.append(this.d);
        u.append(", isInstalled=true, sizeMb=");
        u.append(this.e);
        u.append(")");
        return u.toString();
    }
}
