package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.ParcelFileDescriptor;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.c;
import androidx.fragment.app.g;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ u(sb1 sb1Var, sm1 sm1Var, i90 i90Var) {
        this.A = 12;
        Map map = Collections.EMPTY_MAP;
        this.B = sb1Var;
        this.L = sm1Var;
        this.R = i90Var;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [cw6, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        pq3 q;
        Object obj = null;
        int i = 0;
        boolean z = true;
        switch (this.A) {
            case 0:
                Throwable th = (Throwable) this.B;
                v vVar = (v) this.L;
                List list = (List) this.R;
                if (th != null) {
                    vVar.b.onError(th);
                    return;
                } else {
                    vVar.b.L(list);
                    return;
                }
            case 1:
                vl vlVar = (vl) this.B;
                ul ulVar = (ul) this.R;
                ActionMode startActionMode = vlVar.a.startActionMode(new s92((tl) this.L), 1);
                b53.x(vlVar.h, startActionMode);
                if (startActionMode == null) {
                    ulVar.close();
                    return;
                }
                return;
            case 2:
                ((BasePreferenceFragment) this.B).i((RecyclerView) this.L, (String) this.R, 0);
                return;
            case 3:
                ((sb0) this.B).b(rb0.b((gb5) this.L), (hh) this.R);
                return;
            case 4:
                ((sb0) this.B).c(rb0.b((gb5) this.L), (sn1) this.R);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.B;
                l94 l94Var = (l94) this.L;
                String str = (String) this.R;
                try {
                    int size = arrayList.size();
                    while (true) {
                        if (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            if (b53.x(((td0) obj2).f(), str)) {
                                obj = obj2;
                            }
                        }
                    }
                    td0 td0Var = (td0) obj;
                    if (td0Var != null && (q = td0Var.q()) != null) {
                        q.e(l94Var);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case ig7.b /* 6 */:
                String str2 = (String) this.L;
                kh7 kh7Var = (kh7) this.R;
                di7 w = ((WorkDatabase) this.B).w();
                w.getClass();
                str2.getClass();
                for (String str3 : (List) mh7.X(w.a, true, false, new ok0(str2, 18))) {
                    a53.o(kh7Var, str3);
                }
                return;
            case 7:
                e90 e90Var = (e90) this.L;
                dc5 dc5Var = (dc5) this.R;
                l91 l91Var = (l91) ((k91) this.B).B;
                if (l91Var.B.p()) {
                    e90Var.b(l91Var, new IOException("Canceled"));
                    return;
                } else {
                    e90Var.f(l91Var, dc5Var);
                    return;
                }
            case 8:
                ((e90) this.R).b((l91) ((k91) this.L).B, (Throwable) this.B);
                return;
            case 9:
                ViewGroup viewGroup = (ViewGroup) this.B;
                c cVar = (c) this.R;
                viewGroup.getClass();
                viewGroup.endViewTransition((View) this.L);
                cVar.c.a.c(cVar);
                return;
            case 10:
                o oVar = ((b0) this.B).c;
                o oVar2 = ((b0) this.L).c;
                boolean z2 = ((g) this.R).o;
                bh2 bh2Var = wg2.a;
                oVar.getClass();
                oVar2.getClass();
                if (z2) {
                    oVar2.getEnterTransitionCallback();
                    return;
                } else {
                    oVar.getEnterTransitionCallback();
                    return;
                }
            case 11:
                Runnable runnable = (Runnable) this.L;
                Runnable runnable2 = (Runnable) this.R;
                if (((sb1) this.B).j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case mj2.L /* 12 */:
                sb1 sb1Var = (sb1) this.B;
                sm1 sm1Var = (sm1) this.L;
                Map map = Collections.EMPTY_MAP;
                i90 i90Var = (i90) this.R;
                try {
                    sb1Var.a.i(sm1Var);
                    i90Var.a(null);
                    return;
                } catch (RuntimeException e) {
                    i90Var.c(e);
                    return;
                }
            case 13:
                fm1 fm1Var = (fm1) this.B;
                sm1 sm1Var2 = (sm1) this.L;
                Map map2 = Collections.EMPTY_MAP;
                i90 i90Var2 = (i90) this.R;
                try {
                    fm1Var.a.i(sm1Var2);
                    i90Var2.a(null);
                    return;
                } catch (RuntimeException e2) {
                    i90Var2.c(e2);
                    return;
                }
            case 14:
                Runnable runnable3 = (Runnable) this.L;
                Runnable runnable4 = (Runnable) this.R;
                if (((fm1) this.B).f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case ig7.e /* 15 */:
                fh fhVar = (fh) this.B;
                l07 l07Var = (l07) this.L;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.R;
                try {
                    zd2 z3 = f34.z(fhVar.A);
                    if (z3 != null) {
                        yd2 yd2Var = (yd2) ((lo1) z3.b);
                        synchronized (yd2Var.R) {
                            yd2Var.Y = threadPoolExecutor;
                        }
                        ((lo1) z3.b).a(new oo1(l07Var, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    l07Var.i0(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 16:
                final EmulatorMessageQueue emulatorMessageQueue = (EmulatorMessageQueue) this.B;
                n75 n75Var = (n75) this.L;
                CountDownLatch countDownLatch = (CountDownLatch) this.R;
                try {
                    try {
                        if (!emulatorMessageQueue.f) {
                            Looper myLooper = Looper.myLooper();
                            if (myLooper != null) {
                                int a = EmulatorMessageQueue.a();
                                if (a >= 0) {
                                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(a);
                                    if (fromFd != null) {
                                        emulatorMessageQueue.d = fromFd;
                                        emulatorMessageQueue.f = true;
                                        emulatorMessageQueue.e = new FileInputStream(fromFd.getFileDescriptor());
                                        myLooper.getQueue().addOnFileDescriptorEventListener(fromFd.getFileDescriptor(), 1, new MessageQueue.OnFileDescriptorEventListener() { // from class: ss1
                                            @Override // android.os.MessageQueue.OnFileDescriptorEventListener
                                            public final int onFileDescriptorEvents(FileDescriptor fileDescriptor, int i2) {
                                                fileDescriptor.getClass();
                                                EmulatorMessageQueue emulatorMessageQueue2 = EmulatorMessageQueue.this;
                                                if (emulatorMessageQueue2.f) {
                                                    try {
                                                        emulatorMessageQueue2.b();
                                                        return 1;
                                                    } catch (Exception e3) {
                                                        e3.printStackTrace();
                                                        return 1;
                                                    }
                                                }
                                                return 1;
                                            }
                                        });
                                    } else {
                                        throw new RuntimeException("Failed to create ParcelFileDescriptor");
                                    }
                                } else {
                                    throw new RuntimeException("Failed to initialize native pipe");
                                }
                            } else {
                                throw new IllegalStateException("Current thread does not have a Looper");
                            }
                        }
                    } catch (Exception e3) {
                        n75Var.A = e3;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 17:
                ku4 ku4Var = (ku4) this.B;
                l90 l90Var = (l90) this.L;
                ui7 ui7Var = (ui7) this.R;
                ku4Var.getClass();
                try {
                    z = ((Boolean) l90Var.B.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                synchronized (ku4Var.k) {
                    try {
                        gh7 b = ei7.b(ui7Var.a);
                        String str4 = b.a;
                        if (ku4Var.c(str4) == ui7Var) {
                            ku4Var.b(str4);
                        }
                        y70.f().b(ku4.l, ku4.class.getSimpleName() + " " + str4 + " executed; reschedule = " + z);
                        ArrayList arrayList2 = ku4Var.j;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            ((k22) obj3).d(b, z);
                        }
                    } finally {
                    }
                }
                return;
            case 18:
                ((n85) this.B).b((wj6) this.L, (Map.Entry) this.R);
                return;
            default:
                td6 td6Var = (td6) this.L;
                final ku4 ku4Var2 = (ku4) ((wv6) this.B).B;
                ku4Var2.getClass();
                gh7 gh7Var = td6Var.a;
                final String str5 = gh7Var.a;
                final ArrayList arrayList3 = new ArrayList();
                xh7 xh7Var = (xh7) ku4Var2.e.o(new bz2(18, new Callable() { // from class: ju4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WorkDatabase workDatabase = ku4.this.e;
                        gi7 x = workDatabase.x();
                        x.getClass();
                        String str6 = str5;
                        str6.getClass();
                        arrayList3.addAll((List) mh7.X(x.a, true, false, new ok0(str6, 26)));
                        return workDatabase.w().d(str6);
                    }
                }));
                if (xh7Var == null) {
                    y70.f().j(ku4.l, "Didn't find WorkSpec for id " + gh7Var);
                    ku4Var2.d.d.execute(new xc4(2, ku4Var2, gh7Var));
                    return;
                }
                synchronized (ku4Var2.k) {
                    try {
                        synchronized (ku4Var2.k) {
                            if (ku4Var2.c(str5) != null) {
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            Set set = (Set) ku4Var2.h.get(str5);
                            if (((td6) set.iterator().next()).a.b == gh7Var.b) {
                                set.add(td6Var);
                                y70.f().b(ku4.l, "Work " + gh7Var + " is already enqueued for processing");
                            } else {
                                ku4Var2.d.d.execute(new xc4(2, ku4Var2, gh7Var));
                            }
                            return;
                        } else if (xh7Var.t != gh7Var.b) {
                            ku4Var2.d.d.execute(new xc4(2, ku4Var2, gh7Var));
                            return;
                        } else {
                            Context context = ku4Var2.b;
                            ew0 ew0Var = ku4Var2.c;
                            nh7 nh7Var = ku4Var2.d;
                            WorkDatabase workDatabase = ku4Var2.e;
                            context.getClass();
                            ku4Var2.getClass();
                            ?? obj4 = new Object();
                            obj4.b = ew0Var;
                            obj4.c = nh7Var;
                            obj4.d = ku4Var2;
                            obj4.e = workDatabase;
                            obj4.f = xh7Var;
                            obj4.g = arrayList3;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            obj4.a = applicationContext;
                            new so1();
                            ui7 ui7Var2 = new ui7(obj4);
                            g31 g31Var = ui7Var2.d.b;
                            e63 h = ln2.h();
                            g31Var.getClass();
                            l90 O = oo2.O(se.O(g31Var, h), new si7(ui7Var2, null, 1));
                            O.B.a(new u(ku4Var2, O, ui7Var2, 17), ku4Var2.d.d);
                            ku4Var2.g.put(str5, ui7Var2);
                            HashSet hashSet = new HashSet();
                            hashSet.add(td6Var);
                            ku4Var2.h.put(str5, hashSet);
                            y70.f().b(ku4.l, ku4.class.getSimpleName() + ": processing " + gh7Var);
                            return;
                        }
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ u(k91 k91Var, e90 e90Var, Throwable th) {
        this.A = 8;
        this.L = k91Var;
        this.R = e90Var;
        this.B = th;
    }

    public /* synthetic */ u(sb0 sb0Var, rb0 rb0Var, gb5 gb5Var, Object obj, int i) {
        this.A = i;
        this.B = sb0Var;
        this.L = gb5Var;
        this.R = obj;
    }

    public /* synthetic */ u(fm1 fm1Var, sm1 sm1Var, i90 i90Var) {
        this.A = 13;
        Map map = Collections.EMPTY_MAP;
        this.B = fm1Var;
        this.L = sm1Var;
        this.R = i90Var;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
