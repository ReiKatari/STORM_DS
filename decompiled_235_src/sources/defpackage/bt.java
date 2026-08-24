package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PersistableBundle;
import android.os.Trace;
import android.os.Vibrator;
import android.text.Editable;
import android.text.Selection;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.stormds.emulator.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.Adler32;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt  reason: default package */
/* loaded from: classes.dex */
public final class bt implements rm6, dx6, ry3, x92, rb0, r63, f13 {
    public static volatile bt X;
    public static final Object Y = new Object();
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;

    public bt(int i) {
        this.A = i;
        switch (i) {
            case 4:
                this.B = new yz3(16);
                long[] jArr = b66.a;
                this.L = new ja4();
                this.R = new w31(27);
                return;
            case 15:
                this.B = new d51(7);
                this.L = new d51(7);
                this.R = new d51(7);
                return;
            default:
                this.R = new w31(27);
                return;
        }
    }

    public static boolean C(Editable editable, KeyEvent keyEvent, boolean z) {
        se7[] se7VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (se7VarArr = (se7[]) editable.getSpans(selectionStart, selectionEnd, se7.class)) != null && se7VarArr.length > 0) {
                for (se7 se7Var : se7VarArr) {
                    int spanStart = editable.getSpanStart(se7Var);
                    int spanEnd = editable.getSpanEnd(se7Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static bt J(Context context) {
        if (X == null) {
            synchronized (Y) {
                try {
                    if (X == null) {
                        X = new bt(context);
                    }
                } finally {
                }
            }
        }
        return X;
    }

    public fz A() {
        String str;
        if (((String) this.B) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((b35) this.R) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new fz((String) this.B, (byte[]) this.L, (b35) this.R);
        }
        i.m("Missing required properties:".concat(str));
        return null;
    }

    public boolean B(sm3 sm3Var) {
        boolean z;
        boolean z2;
        if (sm3Var.e0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (!((fn6) ((d51) this.B).B).contains(sm3Var) && !((fn6) ((d51) this.L).B).contains(sm3Var)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !z2) {
            return false;
        }
        return true;
    }

    public void D(Bundle bundle) {
        HashSet hashSet = (HashSet) this.L;
        String string = ((Context) this.R).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (j53.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    F((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void E() {
        ((vs4) this.R).setValue(Boolean.TRUE);
        ((ta4) this.L).c.setValue(Boolean.FALSE);
    }

    public Object F(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.B;
        if (ln2.H()) {
            try {
                Trace.beginSection(ln2.f0(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                j53 j53Var = (j53) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = j53Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            F(cls2, hashSet);
                        }
                    }
                }
                obj = j53Var.b((Context) this.R);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    public xj0 G() {
        return ((zj0) this.R).A.c;
    }

    public gy3 H() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((w31) this.R)) {
            try {
                gy3 gy3Var = (gy3) this.L;
                if (gy3Var != null && localeList == ((LocaleList) this.B)) {
                    return gy3Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new fy3(localeList.get(i)));
                }
                gy3 gy3Var2 = new gy3(arrayList);
                this.B = localeList;
                this.L = gy3Var2;
                return gy3Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public qh1 I() {
        return ((zj0) this.R).A.a;
    }

    public kk3 K() {
        return ((zj0) this.R).A.b;
    }

    public long L() {
        return ((zj0) this.R).A.d;
    }

    public boolean M() {
        return !((ArrayList) this.R).isEmpty();
    }

    public boolean N(CharSequence charSequence, int i, int i2, re7 re7Var) {
        int i3;
        if ((re7Var.c & 3) == 0) {
            ae1 ae1Var = (ae1) this.R;
            p54 b = re7Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.R).getShort(a + b.A);
            }
            ae1Var.getClass();
            ThreadLocal threadLocal = ae1.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = ae1Var.a.hasGlyph(sb.toString());
            int i4 = re7Var.c & 4;
            if (hasGlyph) {
                i3 = i4 | 2;
            } else {
                i3 = i4 | 1;
            }
            re7Var.c = i3;
        }
        if ((re7Var.c & 3) != 2) {
            return false;
        }
        return true;
    }

    public boolean O() {
        boolean z;
        if (((fn6) ((d51) this.B).B).isEmpty() && ((fn6) ((d51) this.R).B).isEmpty() && ((fn6) ((d51) this.L).B).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public boolean P(int i, p11 p11Var, l21 l21Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        e30 e30Var = (e30) this.L;
        k21[] k21VarArr = l21Var.T;
        int[] iArr = l21Var.t;
        e30Var.a = k21VarArr[0];
        e30Var.b = k21VarArr[1];
        e30Var.c = l21Var.r();
        e30Var.d = l21Var.l();
        e30Var.i = false;
        e30Var.j = i;
        k21 k21Var = e30Var.a;
        k21 k21Var2 = k21.MATCH_CONSTRAINT;
        if (k21Var == k21Var2) {
            z = true;
        } else {
            z = false;
        }
        if (e30Var.b == k21Var2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && l21Var.X > RecyclerView.B1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && l21Var.X > RecyclerView.B1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && iArr[0] == 4) {
            e30Var.a = k21.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            e30Var.b = k21.FIXED;
        }
        p11Var.b(l21Var, e30Var);
        l21Var.P(e30Var.e);
        l21Var.M(e30Var.f);
        l21Var.E = e30Var.h;
        l21Var.J(e30Var.g);
        e30Var.j = 0;
        return e30Var.i;
    }

    public Object Q(CharSequence charSequence, int i, int i2, int i3, boolean z, gt1 gt1Var) {
        int i4;
        r54 r54Var;
        boolean z2;
        it1 it1Var = new it1((r54) ((eb) this.L).R);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z3 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = it1Var.c.a;
                if (sparseArray == null) {
                    r54Var = null;
                } else {
                    r54Var = (r54) sparseArray.get(codePointAt);
                }
                if (it1Var.a != 2) {
                    if (r54Var == null) {
                        it1Var.a();
                        z2 = true;
                    } else {
                        it1Var.a = 2;
                        it1Var.c = r54Var;
                        it1Var.f = 1;
                        z2 = true;
                    }
                } else {
                    if (r54Var != null) {
                        it1Var.c = r54Var;
                        it1Var.f++;
                    } else {
                        if (codePointAt == 65038) {
                            it1Var.a();
                        } else if (codePointAt != 65039) {
                            r54 r54Var2 = it1Var.c;
                            if (r54Var2.b != null) {
                                if (it1Var.f == 1) {
                                    if (it1Var.b()) {
                                        it1Var.d = it1Var.c;
                                        it1Var.a();
                                    } else {
                                        it1Var.a();
                                    }
                                } else {
                                    it1Var.d = r54Var2;
                                    it1Var.a();
                                }
                                z2 = true;
                            } else {
                                it1Var.a();
                            }
                        }
                        z2 = true;
                    }
                    z2 = true;
                }
                it1Var.e = codePointAt;
                if (!z2) {
                    if (!z2) {
                        if (z2) {
                            if (z || !N(charSequence, i4, i6, it1Var.d.b)) {
                                z3 = gt1Var.m(charSequence, i4, i6, it1Var.d.b);
                                i5++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i6;
                        if (charCount < i2) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i6 = charCount;
                    }
                } else {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                }
            }
        }
        if (it1Var.a == 2 && it1Var.c.b != null && ((it1Var.f > 1 || it1Var.b()) && i5 < i3 && z3 && (z || !N(charSequence, i4, i6, it1Var.c.b)))) {
            gt1Var.m(charSequence, i4, i6, it1Var.c.b);
        }
        return gt1Var.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [au6, java.lang.Object] */
    public void R(Object[] objArr) {
        ?? obj = new Object();
        System.currentTimeMillis();
        obj.a = (zt6) this.L;
        Thread.currentThread().getName();
        obj.b = objArr;
        ((Queue) this.R).add(obj);
    }

    public void S(Object[] objArr) {
        Throwable th = null;
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
        }
        if (th != null) {
            if (objArr.length != 0) {
                int length = objArr.length - 1;
                Object[] objArr2 = new Object[length];
                if (length > 0) {
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                }
                R(objArr2);
                return;
            }
            i.m("non-sensical empty or null argument array");
            return;
        }
        R(objArr);
    }

    public void T(ex1 ex1Var) {
        ex1Var.getClass();
        ArrayList arrayList = (ArrayList) this.R;
        arrayList.remove(ex1Var);
        if (arrayList.isEmpty()) {
            ((bv1) this.B).c();
        }
    }

    public void U(fz fzVar, int i, boolean z) {
        Long l;
        uy uyVar = (uy) this.L;
        Context context = (Context) this.R;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = fzVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        b35 b35Var = fzVar.c;
        adler32.update(allocate.putInt(d35.a(b35Var)).array());
        byte[] bArr = fzVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        nj2.l("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", fzVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((i36) this.B).e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(d35.a(b35Var))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(uyVar.a(b35Var, longValue, i));
            Set set = ((vy) uyVar.b.get(b35Var)).c;
            if (set.contains(f66.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(f66.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(f66.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", d35.a(b35Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Log.d("TransportRuntime.".concat("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", fzVar, Integer.valueOf(value), Long.valueOf(uyVar.a(b35Var, longValue, i)), l, Integer.valueOf(i)));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void V(xj0 xj0Var) {
        ((zj0) this.R).A.c = xj0Var;
    }

    public void W(qh1 qh1Var) {
        ((zj0) this.R).A.a = qh1Var;
    }

    public void X(kk3 kk3Var) {
        ((zj0) this.R).A.b = kk3Var;
    }

    public void Y(long j) {
        ((zj0) this.R).A.d = j;
    }

    public void Z(m21 m21Var, int i, int i2, int i3) {
        m21Var.getClass();
        int i4 = m21Var.c0;
        int i5 = m21Var.d0;
        m21Var.c0 = 0;
        m21Var.d0 = 0;
        m21Var.P(i2);
        m21Var.M(i3);
        if (i4 < 0) {
            m21Var.c0 = 0;
        } else {
            m21Var.c0 = i4;
        }
        if (i5 < 0) {
            m21Var.d0 = 0;
        } else {
            m21Var.d0 = i5;
        }
        m21 m21Var2 = (m21) this.R;
        m21Var2.w0 = i;
        m21Var2.V();
    }

    @Override // defpackage.ry3
    public void a(Long l, Long l2) {
        ot3 ot3Var = ot3.ERROR;
        R(new Object[]{l, l2});
    }

    public void a0(m21 m21Var) {
        ArrayList arrayList = (ArrayList) this.B;
        arrayList.clear();
        int size = m21Var.t0.size();
        for (int i = 0; i < size; i++) {
            l21 l21Var = (l21) m21Var.t0.get(i);
            k21[] k21VarArr = l21Var.T;
            k21 k21Var = k21VarArr[0];
            k21 k21Var2 = k21.MATCH_CONSTRAINT;
            if (k21Var == k21Var2 || k21VarArr[1] == k21Var2) {
                arrayList.add(l21Var);
            }
        }
        m21Var.v0.b = true;
    }

    @Override // defpackage.ry3
    public void b(Object obj, String str) {
        ot3 ot3Var = ot3.ERROR;
        R(new Object[]{obj});
    }

    @Override // defpackage.r63
    public Uri c() {
        return (Uri) this.B;
    }

    @Override // defpackage.rm6
    public void cancel() {
        switch (this.A) {
            case 7:
                ((rm6) this.B).cancel();
                return;
            default:
                ((v62) ((bk1) this.R).R).cancel();
                return;
        }
    }

    @Override // defpackage.ry3
    public void d(Object obj, IOException iOException) {
        ot3 ot3Var = ot3.ERROR;
        R(new Object[]{obj});
    }

    @Override // defpackage.ry3
    public boolean e() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [sy7, java.lang.Object] */
    @Override // defpackage.x92
    public boolean f(rc6 rc6Var) {
        ae0 ae0Var = new ae0();
        ou0 ou0Var = new ou0();
        lg0 lg0Var = (lg0) this.B;
        gr1 gr1Var = new gr1(((qc0) lg0Var).A);
        jh0 jh0Var = (jh0) this.R;
        pf0 pf0Var = new pf0(ae0Var, ou0Var, gr1Var, jh0Var, new Object(), new zf2(jh0Var.a()), lg0Var, null, null);
        zt1 zt1Var = zt1.A;
        return ((Boolean) hv.V(vt1.A, new xd1(this, pf0Var.a(0, rc6Var, true, null, null, zt1Var, zt1Var), null, 14))).booleanValue();
    }

    @Override // defpackage.ry3
    public String getName() {
        return (String) this.B;
    }

    @Override // defpackage.r63
    public Uri h() {
        return (Uri) this.R;
    }

    @Override // defpackage.ry3
    public void i() {
        ot3 ot3Var = ot3.ERROR;
        R(null);
    }

    @Override // defpackage.f13
    public Object j(String str, String str2, String str3, s41 s41Var) {
        xe1 xe1Var = xk1.a;
        return hv.d0(de1.L, new la(str, this, str2, str3, null, 5), s41Var);
    }

    @Override // defpackage.rm6
    public in6 k() {
        switch (this.A) {
            case 7:
                return (fe5) this.L;
            default:
                return (t62) this.L;
        }
    }

    @Override // defpackage.ry3
    public void l(Object... objArr) {
        ot3 ot3Var = ot3.ERROR;
        S(objArr);
    }

    @Override // defpackage.r63
    public ClipDescription m() {
        return (ClipDescription) this.L;
    }

    @Override // defpackage.dx6
    public Object n() {
        ye1 ye1Var = (ye1) this.B;
        fz fzVar = (fz) this.L;
        hy hyVar = (hy) this.R;
        i36 i36Var = ye1Var.d;
        i36Var.getClass();
        b35 b35Var = fzVar.c;
        String str = hyVar.a;
        String str2 = fzVar.a;
        String concat = "TransportRuntime.".concat("SQLiteEventStore");
        Log.d(concat, "Storing event with priority=" + b35Var + ", name=" + str + " for destination " + str2);
        ((Long) i36Var.k(new m44(i36Var, fzVar, hyVar, 12))).getClass();
        ye1Var.a.U(fzVar, 1, false);
        return null;
    }

    @Override // defpackage.ry3
    public void o(String str) {
        ot3 ot3Var = ot3.ERROR;
        R(null);
    }

    @Override // defpackage.ry3
    public void p(Exception exc) {
        ot3 ot3Var = ot3.ERROR;
        R(null);
    }

    @Override // defpackage.ry3
    public void q(String str) {
        ot3 ot3Var = ot3.ERROR;
        R(null);
    }

    @Override // defpackage.r63
    public Object r() {
        return null;
    }

    @Override // defpackage.rb0
    public Object s(qb0 qb0Var) {
        g15 g15Var = new g15(this, 13);
        uj1 j = u24.j();
        hl5 hl5Var = qb0Var.c;
        if (hl5Var != null) {
            hl5Var.a(j, g15Var);
        }
        ((nv2) this.R).A.set(qb0Var);
        return "HandlerScheduledFuture-" + ((Callable) this.L).toString();
    }

    @Override // defpackage.ry3
    public void t(Object obj) {
        ot3 ot3Var = ot3.ERROR;
        R(new Object[]{obj});
    }

    @Override // defpackage.ry3
    public void u(Object obj) {
        ot3 ot3Var = ot3.ERROR;
        R(new Object[]{obj});
    }

    @Override // defpackage.ry3
    public void v(String str, Exception exc) {
        ot3 ot3Var = ot3.ERROR;
        R(null);
    }

    @Override // defpackage.rm6
    public ui6 w() {
        switch (this.A) {
            case 7:
                return (ee5) this.R;
            default:
                return (s62) this.B;
        }
    }

    @Override // defpackage.ry3
    public void x(Object... objArr) {
        ot3 ot3Var = ot3.ERROR;
        S(objArr);
    }

    public void y(sm3 sm3Var, wb3 wb3Var) {
        d51 d51Var = (d51) this.B;
        d51 d51Var2 = (d51) this.L;
        d51 d51Var3 = (d51) this.R;
        int i = ei1.a[wb3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (sm3Var.e0 != null) {
                            d51Var3.c(sm3Var);
                            return;
                        } else {
                            d51Var2.c(sm3Var);
                            return;
                        }
                    }
                    i.d();
                    return;
                } else if (sm3Var.e0 != null) {
                    d51Var3.c(sm3Var);
                    return;
                } else {
                    d51Var.c(sm3Var);
                    return;
                }
            }
            d51Var2.c(sm3Var);
            d51Var3.c(sm3Var);
            return;
        }
        d51Var.c(sm3Var);
        d51Var3.c(sm3Var);
    }

    public void z(ex1 ex1Var) {
        ex1Var.getClass();
        ArrayList arrayList = (ArrayList) this.R;
        arrayList.add(ex1Var);
        if (arrayList.size() == 1) {
            ((bv1) this.L).c();
        }
    }

    @Override // defpackage.r63
    public void g() {
    }

    public /* synthetic */ bt(int i, boolean z) {
        this.A = i;
    }

    public /* synthetic */ bt(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public bt(bv1 bv1Var, bv1 bv1Var2) {
        this.A = 18;
        this.B = bv1Var;
        this.L = bv1Var2;
        this.R = new ArrayList();
    }

    public bt(EmulatorActivity emulatorActivity, au3 au3Var, lz0 lz0Var) {
        this.A = 20;
        lz0Var.getClass();
        this.B = lz0Var;
        this.L = new bt(au3Var);
        hv.L(au3Var, null, null, new xd1(this, (Vibrator) emulatorActivity.getSystemService(Vibrator.class), null, 7), 3);
        hv.L(au3Var, null, null, new a6(this, null, 17), 3);
    }

    public /* synthetic */ bt(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A = i;
        this.R = obj;
        this.B = obj2;
        this.L = obj3;
    }

    public bt(rm6 rm6Var) {
        this.A = 7;
        this.B = rm6Var;
        this.L = hi2.u(rm6Var.k());
        this.R = hi2.t(rm6Var.w());
    }

    public bt(ConstraintLayout constraintLayout, FrameLayout frameLayout, Toolbar toolbar, View view) {
        this.A = 2;
        this.B = frameLayout;
        this.L = toolbar;
        this.R = view;
    }

    public bt(r14 r14Var, View view) {
        Object obj;
        this.A = 29;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            obj = new Object();
        } else {
            obj = i >= 33 ? new Object() : null;
        }
        this.B = obj;
        this.L = r14Var;
        this.R = view;
    }

    public bt(View view) {
        this.A = 26;
        this.B = view;
        this.L = kj2.M(xr3.NONE, new pj(this, 9));
        this.R = new s35(view);
    }

    public bt(zj0 zj0Var) {
        this.A = 9;
        this.R = zj0Var;
        this.B = new os0(this, 19);
    }

    public bt(Context context) {
        this.A = 0;
        this.R = context.getApplicationContext();
        this.L = new HashSet();
        this.B = new HashMap();
    }

    public bt(m21 m21Var) {
        this.A = 6;
        this.B = new ArrayList();
        this.L = new Object();
        this.R = m21Var;
    }

    public bt(au3 au3Var) {
        this.A = 19;
        tp6 a = up6.a(Boolean.FALSE);
        this.B = a;
        this.L = new de5(a);
        this.R = pf6.b(0, 1, m80.DROP_OLDEST, 1);
        hv.L(au3Var, null, null, new a6(this, null, 18), 3);
    }

    public bt(on2 on2Var) {
        this.A = 1;
        this.B = on2Var;
        Boolean bool = Boolean.FALSE;
        this.L = new ta4(bool);
        this.R = np2.Y(bool);
    }

    public bt(eb ebVar, x31 x31Var, ae1 ae1Var, Set set) {
        this.A = 17;
        this.B = x31Var;
        this.L = ebVar;
        this.R = ae1Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            Q(str, 0, str.length(), 1, true, new gr1(str, 7));
        }
    }

    public bt(bk1 bk1Var) {
        this.A = 22;
        this.R = bk1Var;
        v62 v62Var = (v62) bk1Var.R;
        this.B = new s62(bk1Var, v62Var.h().w(), -1L, true);
        this.L = new t62(bk1Var, v62Var.h().k(), -1L, true);
    }

    public bt(xk4 xk4Var) {
        this.A = 28;
        pi3 pi3Var = new pi3(4);
        pi3 pi3Var2 = new pi3(5);
        xk4Var.getClass();
        this.B = xk4Var;
        this.L = pi3Var;
        this.R = pi3Var2;
    }

    public bt(sb1 sb1Var, pb1 pb1Var) {
        this.A = 13;
        this.B = sb1Var;
        this.L = pb1Var;
    }
}
