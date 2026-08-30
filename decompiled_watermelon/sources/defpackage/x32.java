package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x32  reason: default package */
/* loaded from: classes.dex */
public class x32 extends w32 {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public x32(WindowLayoutComponent windowLayoutComponent, zz0 zz0Var) {
        super(windowLayoutComponent, zz0Var);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // defpackage.w32, defpackage.u32, defpackage.ee7
    public final void a(wz0 wz0Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(wz0Var);
            if (context == null) {
                return;
            }
            c14 c14Var = (c14) linkedHashMap.get(context);
            if (c14Var == null) {
                return;
            }
            ReentrantLock reentrantLock2 = c14Var.b;
            reentrantLock2.lock();
            c14Var.d.remove(wz0Var);
            reentrantLock2.unlock();
            linkedHashMap2.remove(wz0Var);
            if (c14Var.d.isEmpty()) {
                linkedHashMap.remove(context);
                this.a.removeWindowLayoutInfoListener(c14Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.w32, defpackage.u32, defpackage.ee7
    public final void b(Context context, Executor executor, wz0 wz0Var) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            c14 c14Var = (c14) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (c14Var != null) {
                c14Var.a(wz0Var);
                linkedHashMap2.put(wz0Var, context);
            } else {
                c14 c14Var2 = new c14(context);
                linkedHashMap.put(context, c14Var2);
                linkedHashMap2.put(wz0Var, context);
                c14Var2.a(wz0Var);
                this.a.addWindowLayoutInfoListener(context, c14Var2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
