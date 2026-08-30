package l9;

import android.graphics.Bitmap;
import androidx.preference.Preference;
import java.util.Date;
import pi.q;
import q9.g;
import vc.o;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final x0 f8991a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8992b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f8993c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8994d;

    /* renamed from: e  reason: collision with root package name */
    public final Date f8995e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8996f;

    /* renamed from: g  reason: collision with root package name */
    public final Date f8997g;

    /* renamed from: h  reason: collision with root package name */
    public final long f8998h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8999i;

    /* renamed from: j  reason: collision with root package name */
    public final String f9000j;

    /* renamed from: k  reason: collision with root package name */
    public final int f9001k;

    public c(x0 x0Var, b bVar) {
        int i2;
        this.f8991a = x0Var;
        this.f8992b = bVar;
        this.f9001k = -1;
        if (bVar != null) {
            this.f8998h = bVar.f8987c;
            this.f8999i = bVar.f8988d;
            q qVar = bVar.f8990f;
            int size = qVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String b10 = qVar.b(i10);
                if (b10.equalsIgnoreCase("Date")) {
                    String a10 = qVar.a("Date");
                    this.f8993c = a10 != null ? ui.c.a(a10) : null;
                    this.f8994d = qVar.d(i10);
                } else if (b10.equalsIgnoreCase("Expires")) {
                    String a11 = qVar.a("Expires");
                    this.f8997g = a11 != null ? ui.c.a(a11) : null;
                } else if (b10.equalsIgnoreCase("Last-Modified")) {
                    String a12 = qVar.a("Last-Modified");
                    this.f8995e = a12 != null ? ui.c.a(a12) : null;
                    this.f8996f = qVar.d(i10);
                } else if (b10.equalsIgnoreCase("ETag")) {
                    this.f9000j = qVar.d(i10);
                } else if (b10.equalsIgnoreCase("Age")) {
                    String d4 = qVar.d(i10);
                    Bitmap.Config[] configArr = g.f12393a;
                    Long X = o.X(d4);
                    if (X != null) {
                        long longValue = X.longValue();
                        if (longValue > 2147483647L) {
                            i2 = Preference.DEFAULT_ORDER;
                        } else if (longValue < 0) {
                            i2 = 0;
                        } else {
                            i2 = (int) longValue;
                        }
                    } else {
                        i2 = -1;
                    }
                    this.f9001k = i2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (r4 > 0) goto L33;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [yb.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l9.d a() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.c.a():l9.d");
    }
}
