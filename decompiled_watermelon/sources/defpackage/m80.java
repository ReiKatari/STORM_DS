package defpackage;

import android.graphics.Bitmap;
import androidx.preference.Preference;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m80  reason: default package */
/* loaded from: classes.dex */
public final class m80 {
    public final ka a;
    public final l80 b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public m80(ka kaVar, l80 l80Var) {
        int i;
        this.a = kaVar;
        this.b = l80Var;
        this.k = -1;
        if (l80Var != null) {
            this.h = l80Var.c;
            this.i = l80Var.d;
            xq2 xq2Var = l80Var.f;
            int size = xq2Var.size();
            for (int i2 = 0; i2 < size; i2++) {
                String c = xq2Var.c(i2);
                if (c.equalsIgnoreCase("Date")) {
                    String b = xq2Var.b("Date");
                    this.c = b != null ? l81.a(b) : null;
                    this.d = xq2Var.i(i2);
                } else if (c.equalsIgnoreCase("Expires")) {
                    String b2 = xq2Var.b("Expires");
                    this.g = b2 != null ? l81.a(b2) : null;
                } else if (c.equalsIgnoreCase("Last-Modified")) {
                    String b3 = xq2Var.b("Last-Modified");
                    this.e = b3 != null ? l81.a(b3) : null;
                    this.f = xq2Var.i(i2);
                } else if (c.equalsIgnoreCase("ETag")) {
                    this.j = xq2Var.i(i2);
                } else if (c.equalsIgnoreCase("Age")) {
                    String i3 = xq2Var.i(i2);
                    Bitmap.Config[] configArr = k.a;
                    Long p0 = gh6.p0(i3);
                    if (p0 != null) {
                        long longValue = p0.longValue();
                        if (longValue > 2147483647L) {
                            i = Preference.DEFAULT_ORDER;
                        } else if (longValue < 0) {
                            i = 0;
                        } else {
                            i = (int) longValue;
                        }
                    } else {
                        i = -1;
                    }
                    this.k = i;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (r4 > 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n80 a() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m80.a():n80");
    }
}
