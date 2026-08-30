package a8;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import k7.w;
import m6.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ f(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    private final void a() {
        p pVar = (p) this.B;
        synchronized (pVar.f9296d) {
            try {
                if (pVar.f9300h == null) {
                    return;
                }
                try {
                    v5.g c4 = pVar.c();
                    int i2 = c4.f13750f;
                    if (i2 == 2) {
                        synchronized (pVar.f9296d) {
                        }
                    }
                    if (i2 == 0) {
                        Method method = u5.e.f13494b;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        k0.g gVar = pVar.f9295c;
                        Context context = pVar.f9293a;
                        gVar.getClass();
                        v5.g[] gVarArr = {c4};
                        p7.j jVar = q5.e.f12290a;
                        Trace.beginSection(aj.g.v0("TypefaceCompat.createFromFontInfo"));
                        Typeface q10 = q5.e.f12290a.q(context, gVarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer u4 = p7.k.u(pVar.f9293a, c4.f13745a);
                        if (u4 != null && q10 != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            b9.e eVar = new b9.e(q10, pc.a.J(u4));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (pVar.f9296d) {
                                w wVar = pVar.f9300h;
                                if (wVar != null) {
                                    wVar.y(eVar);
                                }
                            }
                            pVar.a();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                } catch (Throwable th2) {
                    synchronized (pVar.f9296d) {
                        try {
                            w wVar2 = pVar.f9300h;
                            if (wVar2 != null) {
                                wVar2.x(th2);
                            }
                            pVar.a();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b8  */
    /* JADX WARN: Type inference failed for: r0v76, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20, types: [c8.t, c8.z] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.run():void");
    }
}
