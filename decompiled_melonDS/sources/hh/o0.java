package hh;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f6552a;

    /* renamed from: b  reason: collision with root package name */
    public final URL f6553b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6554c;

    /* renamed from: d  reason: collision with root package name */
    public final wc.b f6555d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6556e;

    public o0(String str, URL url, String str2, wc.b bVar, boolean z10) {
        this.f6552a = str;
        this.f6553b = url;
        this.f6554c = str2;
        this.f6555d = bVar;
        this.f6556e = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (!this.f6552a.equals(o0Var.f6552a) || !this.f6553b.equals(o0Var.f6553b) || !nc.k.a(this.f6554c, o0Var.f6554c) || !nc.k.a(this.f6555d, o0Var.f6555d) || this.f6556e != o0Var.f6556e) {
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
        int hashCode2 = (this.f6553b.hashCode() + (this.f6552a.hashCode() * 31)) * 31;
        int i2 = 0;
        String str = this.f6554c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        wc.b bVar = this.f6555d;
        if (bVar != null) {
            i2 = Long.hashCode(bVar.A);
        }
        return Boolean.hashCode(this.f6556e) + ((i10 + i2) * 31);
    }

    public final String toString() {
        return "GameMastered(gameTitle=" + this.f6552a + ", gameIcon=" + this.f6553b + ", userName=" + this.f6554c + ", playTime=" + this.f6555d + ", forHardcodeMode=" + this.f6556e + ")";
    }
}
