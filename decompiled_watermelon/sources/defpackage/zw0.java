package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zw0  reason: default package */
/* loaded from: classes.dex */
public final class zw0 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public ax0 a() {
        return new ax0(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(ho0... ho0VarArr) {
        if (this.a) {
            ArrayList arrayList = new ArrayList(ho0VarArr.length);
            for (ho0 ho0Var : ho0VarArr) {
                arrayList.add(ho0Var.a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (this.a) {
                if (strArr2.length != 0) {
                    this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                } else {
                    i.i("At least one cipher suite is required");
                    return;
                }
            }
            i.i("no cipher suites for cleartext connections");
            return;
        }
        i.i("no cipher suites for cleartext connections");
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.String[], java.io.Serializable] */
    public void c(ut6... ut6VarArr) {
        if (this.a) {
            ArrayList arrayList = new ArrayList(ut6VarArr.length);
            for (ut6 ut6Var : ut6VarArr) {
                arrayList.add(ut6Var.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (this.a) {
                if (strArr2.length != 0) {
                    this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                } else {
                    i.i("At least one TLS version is required");
                    return;
                }
            }
            i.i("no TLS versions for cleartext connections");
            return;
        }
        i.i("no TLS versions for cleartext connections");
    }
}
