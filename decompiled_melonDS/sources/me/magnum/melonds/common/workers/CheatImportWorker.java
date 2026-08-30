package me.magnum.melonds.common.workers;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cf.a;
import m5.h;
import me.magnum.melonds.R;
import p8.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class CheatImportWorker extends CoroutineWorker {

    /* renamed from: g  reason: collision with root package name */
    public final a f9470g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheatImportWorker(Context context, WorkerParameters workerParameters, a aVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        aVar.getClass();
        this.f9470g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(cc.c r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.common.workers.CheatImportWorker.c(cc.c):java.lang.Object");
    }

    public final m e(String str, int i2, boolean z10) {
        Context context = this.f11503a;
        h hVar = new h(context);
        hVar.f9254f = -1;
        hVar.f9256h = h.b(context.getString(R.string.importing_cheats));
        if (str == null) {
            str = "";
        }
        hVar.f9253e = h.b(str);
        hVar.m = context.getColor(R.color.melonMain);
        hVar.f9263p.icon = R.drawable.ic_melon_small;
        hVar.f9257i = 100;
        hVar.f9258j = i2;
        hVar.f9259k = z10;
        Notification a10 = hVar.a();
        a10.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new m(100, a10, 1);
        }
        return new m(100, a10, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.net.Uri r9, l7.a r10, java.lang.Long r11, ec.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof de.b
            if (r0 == 0) goto L13
            r0 = r12
            de.b r0 = (de.b) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            de.b r0 = new de.b
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r12)
            goto L85
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L2e:
            p7.j.I(r12)
            r0.Y = r3
            cc.i r6 = new cc.i
            cc.c r12 = pc.a.A(r0)
            dc.a r0 = dc.a.UNDECIDED
            r6.<init>(r12, r0)
            android.content.Context r12 = r8.f11503a
            android.content.ContentResolver r12 = r12.getContentResolver()
            java.io.InputStream r9 = r12.openInputStream(r9)
            if (r9 == 0) goto L7e
            ud.a r5 = new ud.a     // Catch: java.lang.Throwable -> L75
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L75
            b9.e r2 = new b9.e     // Catch: java.lang.Throwable -> L75
            r7 = 7
            r3 = r8
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L75
            r10.getClass()     // Catch: java.lang.Throwable -> L75
            javax.xml.parsers.SAXParserFactory r10 = javax.xml.parsers.SAXParserFactory.newInstance()     // Catch: java.lang.Throwable -> L75
            javax.xml.parsers.SAXParser r10 = r10.newSAXParser()     // Catch: java.lang.Throwable -> L75
            kf.e2 r11 = new kf.e2     // Catch: java.lang.Throwable -> L75
            rd.k r12 = new rd.k     // Catch: java.lang.Throwable -> L75
            r0 = 8
            r12.<init>(r0, r2)     // Catch: java.lang.Throwable -> L75
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L75
            r10.parse(r5, r11)     // Catch: java.lang.Throwable -> L75
            r9.close()
            goto L7e
        L75:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            r11 = r0
            l0.f.f(r9, r10)
            throw r11
        L7e:
            java.lang.Object r12 = r6.a()
            if (r12 != r1) goto L85
            return r1
        L85:
            r12.getClass()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.common.workers.CheatImportWorker.f(android.net.Uri, l7.a, java.lang.Long, ec.c):java.lang.Object");
    }
}
