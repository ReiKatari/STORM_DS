package pi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11751a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11752b;

    /* renamed from: c  reason: collision with root package name */
    public Object f11753c;

    /* renamed from: d  reason: collision with root package name */
    public Serializable f11754d;

    public m a() {
        return new m(this.f11751a, this.f11752b, (String[]) this.f11753c, (String[]) this.f11754d);
    }

    public void b(k... kVarArr) {
        if (this.f11751a) {
            ArrayList arrayList = new ArrayList(kVarArr.length);
            for (k kVar : kVarArr) {
                arrayList.add(kVar.f11749a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (this.f11751a) {
                if (strArr2.length != 0) {
                    this.f11753c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                } else {
                    a0.j.h("At least one cipher suite is required");
                    return;
                }
            }
            a0.j.h("no cipher suites for cleartext connections");
            return;
        }
        a0.j.h("no cipher suites for cleartext connections");
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.String[], java.io.Serializable] */
    public void c(j0... j0VarArr) {
        if (this.f11751a) {
            ArrayList arrayList = new ArrayList(j0VarArr.length);
            for (j0 j0Var : j0VarArr) {
                arrayList.add(j0Var.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (this.f11751a) {
                if (strArr2.length != 0) {
                    this.f11754d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                } else {
                    a0.j.h("At least one TLS version is required");
                    return;
                }
            }
            a0.j.h("no TLS versions for cleartext connections");
            return;
        }
        a0.j.h("no TLS versions for cleartext connections");
    }
}
