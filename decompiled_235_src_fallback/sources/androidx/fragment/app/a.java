package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a extends defpackage.vl2 implements defpackage.jl2 {
    public final androidx.fragment.app.u t;
    public boolean u;
    public int v;

    public a(androidx.fragment.app.u r3) {
            r2 = this;
            gl2 r0 = r3.H()
            cl2 r1 = r3.w
            if (r1 == 0) goto Lf
            jq r1 = r1.B
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.v = r0
            r2.t = r3
            return
    }

    @Override // defpackage.jl2
    public final boolean a(java.util.ArrayList r3, java.util.ArrayList r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Run: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            r3.add(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.add(r3)
            boolean r3 = r2.i
            if (r3 == 0) goto L2d
            androidx.fragment.app.u r3 = r2.t
            java.util.ArrayList r3 = r3.d
            r3.add(r2)
        L2d:
            r2 = 1
            return r2
    }

    @Override // defpackage.vl2
    public final void d(int r4, androidx.fragment.app.o r5, java.lang.String r6, int r7) {
            r3 = this;
            java.lang.String r0 = r5.mPreviousWho
            if (r0 == 0) goto L7
            defpackage.tl2.c(r5, r0)
        L7:
            java.lang.Class r0 = r5.getClass()
            int r1 = r0.getModifiers()
            boolean r2 = r0.isAnonymousClass()
            if (r2 != 0) goto Lbd
            boolean r2 = java.lang.reflect.Modifier.isPublic(r1)
            if (r2 == 0) goto Lbd
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L27
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Lbd
        L27:
            java.lang.String r0 = " now "
            java.lang.String r1 = ": was "
            if (r6 == 0) goto L5c
            java.lang.String r2 = r5.mTag
            if (r2 == 0) goto L5a
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L38
            goto L5a
        L38:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Can't change tag of fragment "
            r4.<init>(r7)
            r4.append(r5)
            java.lang.String r5 = r5.mTag
            r4.append(r1)
            r4.append(r5)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L5a:
            r5.mTag = r6
        L5c:
            if (r4 == 0) goto Lb0
            r2 = -1
            if (r4 == r2) goto L8f
            int r6 = r5.mFragmentId
            if (r6 == 0) goto L8a
            if (r6 != r4) goto L68
            goto L8a
        L68:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Can't change container ID of fragment "
            r6.<init>(r7)
            r6.append(r5)
            int r5 = r5.mFragmentId
            r6.append(r1)
            r6.append(r5)
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.<init>(r4)
            throw r3
        L8a:
            r5.mFragmentId = r4
            r5.mContainerId = r4
            goto Lb0
        L8f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Can't add fragment "
            r4.<init>(r7)
            r4.append(r5)
            java.lang.String r5 = " with tag "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = " to container view with no id"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        Lb0:
            ul2 r4 = new ul2
            r4.<init>(r5, r7)
            r3.b(r4)
            androidx.fragment.app.u r3 = r3.t
            r5.mFragmentManager = r3
            return
        Lbd:
            java.lang.String r3 = r0.getCanonicalName()
            java.lang.String r4 = " must be a public static class to be  properly recreated from instance state."
            java.lang.String r5 = "Fragment "
            defpackage.i.g(r3, r4, r5)
            return
    }

    public final void f(int r8) {
            r7 = this;
            boolean r0 = r7.i
            if (r0 != 0) goto L5
            goto L67
        L5:
            r0 = 2
            boolean r1 = androidx.fragment.app.u.K(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Bump nesting in "
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r3 = " by "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L27:
            java.util.ArrayList r7 = r7.c
            int r1 = r7.size()
            r3 = 0
        L2e:
            if (r3 >= r1) goto L67
            java.lang.Object r4 = r7.get(r3)
            ul2 r4 = (defpackage.ul2) r4
            androidx.fragment.app.o r5 = r4.b
            if (r5 == 0) goto L64
            int r6 = r5.mBackStackNesting
            int r6 = r6 + r8
            r5.mBackStackNesting = r6
            boolean r5 = androidx.fragment.app.u.K(r0)
            if (r5 == 0) goto L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Bump nesting of "
            r5.<init>(r6)
            androidx.fragment.app.o r6 = r4.b
            r5.append(r6)
            java.lang.String r6 = " to "
            r5.append(r6)
            androidx.fragment.app.o r4 = r4.b
            int r4 = r4.mBackStackNesting
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.v(r2, r4)
        L64:
            int r3 = r3 + 1
            goto L2e
        L67:
            return
    }

    public final void g() {
            r5 = this;
            java.util.ArrayList r5 = r5.c
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L4e
            java.lang.Object r1 = r5.get(r0)
            ul2 r1 = (defpackage.ul2) r1
            boolean r2 = r1.c
            if (r2 != 0) goto L15
            goto L4b
        L15:
            int r2 = r1.a
            r3 = 8
            r4 = 0
            if (r2 != r3) goto L26
            r1.c = r4
            int r1 = r0 + (-1)
            r5.remove(r1)
            int r0 = r0 + (-1)
            goto L4b
        L26:
            androidx.fragment.app.o r2 = r1.b
            int r2 = r2.mContainerId
            r3 = 2
            r1.a = r3
            r1.c = r4
            int r1 = r0 + (-1)
        L31:
            if (r1 < 0) goto L4b
            java.lang.Object r3 = r5.get(r1)
            ul2 r3 = (defpackage.ul2) r3
            boolean r4 = r3.c
            if (r4 == 0) goto L48
            androidx.fragment.app.o r3 = r3.b
            int r3 = r3.mContainerId
            if (r3 != r2) goto L48
            r5.remove(r1)
            int r0 = r0 + (-1)
        L48:
            int r1 = r1 + (-1)
            goto L31
        L4b:
            int r0 = r0 + (-1)
            goto L8
        L4e:
            return
    }

    public final int h() {
            r2 = this;
            r0 = 0
            r1 = 1
            int r2 = r2.i(r0, r1)
            return r2
    }

    public final int i(boolean r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.u
            if (r0 != 0) goto L4d
            r0 = 2
            boolean r0 = androidx.fragment.app.u.K(r0)
            r1 = 1
            if (r0 == 0) goto L31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Commit: "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
            qy3 r0 = new qy3
            r0.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            java.lang.String r0 = "  "
            r3.j(r0, r2, r1)
            r2.close()
        L31:
            r3.u = r1
            boolean r0 = r3.i
            androidx.fragment.app.u r1 = r3.t
            if (r0 == 0) goto L42
            java.util.concurrent.atomic.AtomicInteger r0 = r1.k
            int r0 = r0.getAndIncrement()
            r3.v = r0
            goto L45
        L42:
            r0 = -1
            r3.v = r0
        L45:
            if (r5 == 0) goto L4a
            r1.x(r3, r4)
        L4a:
            int r3 = r3.v
            return r3
        L4d:
            java.lang.String r3 = "commit already called"
            defpackage.i.m(r3)
            r3 = 0
            return r3
    }

    public final void j(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lcc
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.k
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.v
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.u
            r7.println(r0)
            int r0 = r5.h
            if (r0 == 0) goto L38
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.h
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
        L38:
            int r0 = r5.d
            if (r0 != 0) goto L40
            int r0 = r5.e
            if (r0 == 0) goto L5f
        L40:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.d
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.e
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L5f:
            int r0 = r5.f
            if (r0 != 0) goto L67
            int r0 = r5.g
            if (r0 == 0) goto L86
        L67:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.g
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L86:
            int r0 = r5.l
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r5.m
            if (r0 == 0) goto La9
        L8e:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.l
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.m
            r7.println(r0)
        La9:
            int r0 = r5.n
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r5.o
            if (r0 == 0) goto Lcc
        Lb1:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.n
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.o
            r7.println(r0)
        Lcc:
            java.util.ArrayList r5 = r5.c
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L190
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            int r0 = r5.size()
            r1 = 0
        Le1:
            if (r1 >= r0) goto L190
            java.lang.Object r2 = r5.get(r1)
            ul2 r2 = (defpackage.ul2) r2
            int r3 = r2.a
            switch(r3) {
                case 0: goto L11d;
                case 1: goto L11a;
                case 2: goto L117;
                case 3: goto L114;
                case 4: goto L111;
                case 5: goto L10e;
                case 6: goto L10b;
                case 7: goto L108;
                case 8: goto L105;
                case 9: goto L102;
                case 10: goto Lff;
                default: goto Lee;
            }
        Lee:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "cmd="
            r3.<init>(r4)
            int r4 = r2.a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L11f
        Lff:
            java.lang.String r3 = "OP_SET_MAX_LIFECYCLE"
            goto L11f
        L102:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L11f
        L105:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L11f
        L108:
            java.lang.String r3 = "ATTACH"
            goto L11f
        L10b:
            java.lang.String r3 = "DETACH"
            goto L11f
        L10e:
            java.lang.String r3 = "SHOW"
            goto L11f
        L111:
            java.lang.String r3 = "HIDE"
            goto L11f
        L114:
            java.lang.String r3 = "REMOVE"
            goto L11f
        L117:
            java.lang.String r3 = "REPLACE"
            goto L11f
        L11a:
            java.lang.String r3 = "ADD"
            goto L11f
        L11d:
            java.lang.String r3 = "NULL"
        L11f:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            androidx.fragment.app.o r3 = r2.b
            r7.println(r3)
            if (r8 == 0) goto L18c
            int r3 = r2.d
            if (r3 != 0) goto L146
            int r3 = r2.e
            if (r3 == 0) goto L165
        L146:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.d
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.e
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L165:
            int r3 = r2.f
            if (r3 != 0) goto L16d
            int r3 = r2.g
            if (r3 == 0) goto L18c
        L16d:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.f
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.g
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L18c:
            int r1 = r1 + 1
            goto Le1
        L190:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.v
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.v
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.k
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r2.k
            r0.append(r2)
        L33:
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
