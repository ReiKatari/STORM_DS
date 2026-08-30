package v5;

import android.util.Base64;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f13727a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13728b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13729c;

    /* renamed from: d  reason: collision with root package name */
    public final List f13730d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13731e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13732f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13733g;

    public c(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f13727a = str;
        str2.getClass();
        this.f13728b = str2;
        this.f13729c = str3;
        list.getClass();
        this.f13730d = list;
        this.f13731e = str4;
        this.f13732f = str5;
        this.f13733g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f13727a + ", mProviderPackage: " + this.f13728b + ", mQuery: " + this.f13729c + ", mSystemFont: " + this.f13731e + ", mVariationSettings: " + this.f13732f + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.f13730d;
            if (i2 < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i2);
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i2++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
