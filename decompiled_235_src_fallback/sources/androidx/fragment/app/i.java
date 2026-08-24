package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class i extends androidx.fragment.app.o implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    private static final java.lang.String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final java.lang.String SAVED_CANCELABLE = "android:cancelable";
    private static final java.lang.String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final java.lang.String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final java.lang.String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final java.lang.String SAVED_STYLE = "android:style";
    private static final java.lang.String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private android.app.Dialog mDialog;
    private boolean mDialogCreated;
    private java.lang.Runnable mDismissRunnable;
    private boolean mDismissed;
    private android.os.Handler mHandler;
    private defpackage.fi4 mObserver;
    private android.content.DialogInterface.OnCancelListener mOnCancelListener;
    private android.content.DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public i() {
            r2 = this;
            r2.<init>()
            g15 r0 = new g15
            r1 = 4
            r0.<init>(r2, r1)
            r2.mDismissRunnable = r0
            xi1 r0 = new xi1
            r0.<init>(r2)
            r2.mOnCancelListener = r0
            yi1 r0 = new yi1
            r0.<init>(r2)
            r2.mOnDismissListener = r0
            r0 = 0
            r2.mStyle = r0
            r2.mTheme = r0
            r1 = 1
            r2.mCancelable = r1
            r2.mShowsDialog = r1
            r1 = -1
            r2.mBackStackId = r1
            zi1 r1 = new zi1
            r1.<init>(r2)
            r2.mObserver = r1
            r2.mDialogCreated = r0
            return
    }

    public static /* synthetic */ android.app.Dialog access$000(androidx.fragment.app.i r0) {
            android.app.Dialog r0 = r0.mDialog
            return r0
    }

    public static /* synthetic */ android.content.DialogInterface.OnDismissListener access$100(androidx.fragment.app.i r0) {
            android.content.DialogInterface$OnDismissListener r0 = r0.mOnDismissListener
            return r0
    }

    public static /* synthetic */ boolean access$200(androidx.fragment.app.i r0) {
            boolean r0 = r0.mShowsDialog
            return r0
    }

    @Override // androidx.fragment.app.o
    public defpackage.zk2 createFragmentContainer() {
            r2 = this;
            zk2 r0 = super.createFragmentContainer()
            aj1 r1 = new aj1
            r1.<init>(r2, r0)
            return r1
    }

    public void dismiss() {
            r1 = this;
            r0 = 0
            r1.h(r0, r0, r0)
            return
    }

    public void dismissAllowingStateLoss() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.h(r0, r1, r1)
            return
    }

    public void dismissNow() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.h(r0, r0, r1)
            return
    }

    public android.app.Dialog getDialog() {
            r0 = this;
            android.app.Dialog r0 = r0.mDialog
            return r0
    }

    public boolean getShowsDialog() {
            r0 = this;
            boolean r0 = r0.mShowsDialog
            return r0
    }

    public int getTheme() {
            r0 = this;
            int r0 = r0.mTheme
            return r0
    }

    public final void h(boolean r6, boolean r7, boolean r8) {
            r5 = this;
            boolean r0 = r5.mDismissed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r5.mDismissed = r0
            r1 = 0
            r5.mShownByMe = r1
            android.app.Dialog r2 = r5.mDialog
            if (r2 == 0) goto L33
            r3 = 0
            r2.setOnDismissListener(r3)
            android.app.Dialog r2 = r5.mDialog
            r2.dismiss()
            if (r7 != 0) goto L33
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Handler r2 = r5.mHandler
            android.os.Looper r2 = r2.getLooper()
            if (r7 != r2) goto L2c
            android.app.Dialog r7 = r5.mDialog
            r5.onDismiss(r7)
            goto L33
        L2c:
            android.os.Handler r7 = r5.mHandler
            java.lang.Runnable r2 = r5.mDismissRunnable
            r7.post(r2)
        L33:
            r5.mViewDestroyed = r0
            int r7 = r5.mBackStackId
            if (r7 < 0) goto L73
            java.lang.String r7 = "Bad id: "
            if (r8 == 0) goto L54
            androidx.fragment.app.u r6 = r5.getParentFragmentManager()
            int r8 = r5.mBackStackId
            if (r8 < 0) goto L49
            r6.R(r8, r0)
            goto L67
        L49:
            r6.getClass()
            java.lang.String r5 = defpackage.lb1.g(r8, r7)
            defpackage.i.h(r5)
            return
        L54:
            androidx.fragment.app.u r8 = r5.getParentFragmentManager()
            int r0 = r5.mBackStackId
            r8.getClass()
            if (r0 < 0) goto L6b
            kl2 r7 = new kl2
            r7.<init>(r8, r0)
            r8.x(r7, r6)
        L67:
            r6 = -1
            r5.mBackStackId = r6
            return
        L6b:
            java.lang.String r5 = defpackage.lb1.g(r0, r7)
            defpackage.i.h(r5)
            return
        L73:
            androidx.fragment.app.u r7 = r5.getParentFragmentManager()
            r7.getClass()
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r7)
            r2.r = r0
            androidx.fragment.app.u r7 = r5.mFragmentManager
            androidx.fragment.app.u r3 = r2.t
            if (r7 == 0) goto La7
            if (r7 != r3) goto L8a
            goto La7
        L8a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            r7.<init>(r8)
            java.lang.String r5 = r5.toString()
            r7.append(r5)
            java.lang.String r5 = " is already attached to a FragmentManager."
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        La7:
            ul2 r7 = new ul2
            r4 = 3
            r7.<init>(r5, r4)
            r2.b(r7)
            if (r8 == 0) goto Lc2
            boolean r5 = r2.i
            if (r5 != 0) goto Lbc
            r2.j = r1
            r3.A(r2, r1)
            return
        Lbc:
            java.lang.String r5 = "This transaction is already being added to the back stack"
            defpackage.i.m(r5)
            return
        Lc2:
            if (r6 == 0) goto Lc8
            r2.i(r0, r0)
            return
        Lc8:
            r2.h()
            return
    }

    public boolean isCancelable() {
            r0 = this;
            boolean r0 = r0.mCancelable
            return r0
    }

    @Override // androidx.fragment.app.o
    @java.lang.Deprecated
    public void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            return
    }

    @Override // androidx.fragment.app.o
    public void onAttach(android.content.Context r2) {
            r1 = this;
            super.onAttach(r2)
            qx3 r2 = r1.getViewLifecycleOwnerLiveData()
            fi4 r0 = r1.mObserver
            r2.d(r0)
            boolean r2 = r1.mShownByMe
            if (r2 != 0) goto L13
            r2 = 0
            r1.mDismissed = r2
        L13:
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.o
    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r3.mHandler = r0
            int r0 = r3.mContainerId
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            r3.mShowsDialog = r0
            if (r4 == 0) goto L42
            java.lang.String r0 = "android:style"
            int r0 = r4.getInt(r0, r2)
            r3.mStyle = r0
            java.lang.String r0 = "android:theme"
            int r0 = r4.getInt(r0, r2)
            r3.mTheme = r0
            java.lang.String r0 = "android:cancelable"
            boolean r0 = r4.getBoolean(r0, r1)
            r3.mCancelable = r0
            java.lang.String r0 = "android:showsDialog"
            boolean r1 = r3.mShowsDialog
            boolean r0 = r4.getBoolean(r0, r1)
            r3.mShowsDialog = r0
            java.lang.String r0 = "android:backStackId"
            r1 = -1
            int r4 = r4.getInt(r0, r1)
            r3.mBackStackId = r4
        L42:
            return
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle r2) {
            r1 = this;
            r2 = 3
            boolean r2 = androidx.fragment.app.u.K(r2)
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "onCreateDialog called for DialogFragment "
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r2)
        L1a:
            qv0 r2 = new qv0
            android.content.Context r0 = r1.requireContext()
            int r1 = r1.getTheme()
            r2.<init>(r0, r1)
            return r2
    }

    @Override // androidx.fragment.app.o
    public void onDestroyView() {
            r2 = this;
            super.onDestroyView()
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L21
            r1 = 1
            r2.mViewDestroyed = r1
            r1 = 0
            r0.setOnDismissListener(r1)
            android.app.Dialog r0 = r2.mDialog
            r0.dismiss()
            boolean r0 = r2.mDismissed
            if (r0 != 0) goto L1c
            android.app.Dialog r0 = r2.mDialog
            r2.onDismiss(r0)
        L1c:
            r2.mDialog = r1
            r0 = 0
            r2.mDialogCreated = r0
        L21:
            return
    }

    @Override // androidx.fragment.app.o
    public void onDetach() {
            r1 = this;
            super.onDetach()
            boolean r0 = r1.mShownByMe
            if (r0 != 0) goto Le
            boolean r0 = r1.mDismissed
            if (r0 != 0) goto Le
            r0 = 1
            r1.mDismissed = r0
        Le:
            qx3 r0 = r1.getViewLifecycleOwnerLiveData()
            fi4 r1 = r1.mObserver
            r0.e(r1)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            boolean r2 = r1.mViewDestroyed
            if (r2 != 0) goto L23
            r2 = 3
            boolean r2 = androidx.fragment.app.u.K(r2)
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "onDismiss called for DialogFragment "
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r2)
        L1e:
            r2 = 0
            r0 = 1
            r1.h(r0, r0, r2)
        L23:
            return
    }

    public android.view.View onFindViewById(int r1) {
            r0 = this;
            android.app.Dialog r0 = r0.mDialog
            if (r0 == 0) goto L9
            android.view.View r0 = r0.findViewById(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.fragment.app.o
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r7) {
            r6 = this;
            android.view.LayoutInflater r0 = super.onGetLayoutInflater(r7)
            boolean r1 = r6.mShowsDialog
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L87
            boolean r4 = r6.mCreatingDialog
            if (r4 == 0) goto L11
            goto L87
        L11:
            if (r1 != 0) goto L14
            goto L5e
        L14:
            boolean r1 = r6.mDialogCreated
            if (r1 != 0) goto L5e
            r1 = 0
            r4 = 1
            r6.mCreatingDialog = r4     // Catch: java.lang.Throwable -> L3b
            android.app.Dialog r7 = r6.onCreateDialog(r7)     // Catch: java.lang.Throwable -> L3b
            r6.mDialog = r7     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r6.mShowsDialog     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L55
            int r5 = r6.mStyle     // Catch: java.lang.Throwable -> L3b
            r6.setupDialog(r7, r5)     // Catch: java.lang.Throwable -> L3b
            android.content.Context r7 = r6.getContext()     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r7 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L3d
            android.app.Dialog r5 = r6.mDialog     // Catch: java.lang.Throwable -> L3b
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> L3b
            r5.setOwnerActivity(r7)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r7 = move-exception
            goto L5b
        L3d:
            android.app.Dialog r7 = r6.mDialog     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r6.mCancelable     // Catch: java.lang.Throwable -> L3b
            r7.setCancelable(r5)     // Catch: java.lang.Throwable -> L3b
            android.app.Dialog r7 = r6.mDialog     // Catch: java.lang.Throwable -> L3b
            android.content.DialogInterface$OnCancelListener r5 = r6.mOnCancelListener     // Catch: java.lang.Throwable -> L3b
            r7.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L3b
            android.app.Dialog r7 = r6.mDialog     // Catch: java.lang.Throwable -> L3b
            android.content.DialogInterface$OnDismissListener r5 = r6.mOnDismissListener     // Catch: java.lang.Throwable -> L3b
            r7.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L3b
            r6.mDialogCreated = r4     // Catch: java.lang.Throwable -> L3b
            goto L58
        L55:
            r7 = 0
            r6.mDialog = r7     // Catch: java.lang.Throwable -> L3b
        L58:
            r6.mCreatingDialog = r1
            goto L5e
        L5b:
            r6.mCreatingDialog = r1
            throw r7
        L5e:
            boolean r7 = androidx.fragment.app.u.K(r2)
            if (r7 == 0) goto L7a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r1 = " from dialog context"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r3, r7)
        L7a:
            android.app.Dialog r6 = r6.mDialog
            if (r6 == 0) goto Lb2
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r6 = r0.cloneInContext(r6)
            return r6
        L87:
            boolean r7 = androidx.fragment.app.u.K(r2)
            if (r7 == 0) goto Lb2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            boolean r6 = r6.mShowsDialog
            if (r6 != 0) goto La9
            java.lang.String r6 = "mShowsDialog = false: "
            java.lang.String r6 = r6.concat(r7)
            android.util.Log.d(r3, r6)
            return r0
        La9:
            java.lang.String r6 = "mCreatingDialog = true: "
            java.lang.String r6 = r6.concat(r7)
            android.util.Log.d(r3, r6)
        Lb2:
            return r0
    }

    public boolean onHasView() {
            r0 = this;
            boolean r0 = r0.mDialogCreated
            return r0
    }

    @Override // androidx.fragment.app.o
    public void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            android.app.Dialog r0 = r3.mDialog
            if (r0 == 0) goto L13
            android.os.Bundle r0 = r0.onSaveInstanceState()
            java.lang.String r1 = "android:dialogShowing"
            r2 = 0
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "android:savedDialogState"
            r4.putBundle(r1, r0)
        L13:
            int r0 = r3.mStyle
            if (r0 == 0) goto L1c
            java.lang.String r1 = "android:style"
            r4.putInt(r1, r0)
        L1c:
            int r0 = r3.mTheme
            if (r0 == 0) goto L25
            java.lang.String r1 = "android:theme"
            r4.putInt(r1, r0)
        L25:
            boolean r0 = r3.mCancelable
            if (r0 != 0) goto L2e
            java.lang.String r1 = "android:cancelable"
            r4.putBoolean(r1, r0)
        L2e:
            boolean r0 = r3.mShowsDialog
            if (r0 != 0) goto L37
            java.lang.String r1 = "android:showsDialog"
            r4.putBoolean(r1, r0)
        L37:
            int r3 = r3.mBackStackId
            r0 = -1
            if (r3 == r0) goto L41
            java.lang.String r0 = "android:backStackId"
            r4.putInt(r0, r3)
        L41:
            return
    }

    @Override // androidx.fragment.app.o
    public void onStart() {
            r2 = this;
            super.onStart()
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L2c
            r1 = 0
            r2.mViewDestroyed = r1
            r0.show()
            android.app.Dialog r0 = r2.mDialog
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r0.setTag(r1, r2)
            r1 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r0.setTag(r1, r2)
            r1 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r0.setTag(r1, r2)
        L2c:
            return
    }

    @Override // androidx.fragment.app.o
    public void onStop() {
            r0 = this;
            super.onStop()
            android.app.Dialog r0 = r0.mDialog
            if (r0 == 0) goto La
            r0.hide()
        La:
            return
    }

    @Override // androidx.fragment.app.o
    public void onViewStateRestored(android.os.Bundle r2) {
            r1 = this;
            super.onViewStateRestored(r2)
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto L16
            if (r2 == 0) goto L16
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L16
            android.app.Dialog r1 = r1.mDialog
            r1.onRestoreInstanceState(r2)
        L16:
            return
    }

    @Override // androidx.fragment.app.o
    public void performCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            super.performCreateView(r1, r2, r3)
            android.view.View r1 = r0.mView
            if (r1 != 0) goto L1a
            android.app.Dialog r1 = r0.mDialog
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            java.lang.String r1 = "android:savedDialogState"
            android.os.Bundle r1 = r3.getBundle(r1)
            if (r1 == 0) goto L1a
            android.app.Dialog r0 = r0.mDialog
            r0.onRestoreInstanceState(r1)
        L1a:
            return
    }

    public final defpackage.qv0 requireComponentDialog() {
            r4 = this;
            android.app.Dialog r0 = r4.requireDialog()
            boolean r1 = r0 instanceof defpackage.qv0
            if (r1 == 0) goto Lb
            qv0 r0 = (defpackage.qv0) r0
            return r0
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DialogFragment "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public final android.app.Dialog requireDialog() {
            r2 = this;
            android.app.Dialog r0 = r2.getDialog()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "DialogFragment "
            java.lang.String r1 = " does not have a Dialog."
            defpackage.e41.o(r2, r1, r0)
            r2 = 0
            return r2
    }

    public void setCancelable(boolean r1) {
            r0 = this;
            r0.mCancelable = r1
            android.app.Dialog r0 = r0.mDialog
            if (r0 == 0) goto L9
            r0.setCancelable(r1)
        L9:
            return
    }

    public void setShowsDialog(boolean r1) {
            r0 = this;
            r0.mShowsDialog = r1
            return
    }

    public void setStyle(int r4, int r5) {
            r3 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.u.K(r0)
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Setting style and theme for DialogFragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " to "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L2a:
            r3.mStyle = r4
            if (r4 == r0) goto L31
            r0 = 3
            if (r4 != r0) goto L36
        L31:
            r4 = 16973913(0x1030059, float:2.406115E-38)
            r3.mTheme = r4
        L36:
            if (r5 == 0) goto L3a
            r3.mTheme = r5
        L3a:
            return
    }

    public void setupDialog(android.app.Dialog r2, int r3) {
            r1 = this;
            r1 = 1
            if (r3 == r1) goto L15
            r0 = 2
            if (r3 == r0) goto L15
            r0 = 3
            if (r3 == r0) goto La
            return
        La:
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L15
            r0 = 24
            r3.addFlags(r0)
        L15:
            r2.requestWindowFeature(r1)
            return
    }

    public int show(defpackage.vl2 r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r2.mDismissed = r0
            r1 = 1
            r2.mShownByMe = r1
            r3.d(r0, r2, r4, r1)
            r2.mViewDestroyed = r0
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3
            int r3 = r3.i(r0, r1)
            r2.mBackStackId = r3
            return r3
    }

    public void show(androidx.fragment.app.u r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            r3.mDismissed = r0
            r1 = 1
            r3.mShownByMe = r1
            r4.getClass()
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r4)
            r2.r = r1
            r2.d(r0, r3, r5, r1)
            r2.h()
            return
    }

    public void showNow(androidx.fragment.app.u r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            r3.mDismissed = r0
            r1 = 1
            r3.mShownByMe = r1
            r4.getClass()
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r4)
            r2.r = r1
            r2.d(r0, r3, r5, r1)
            boolean r3 = r2.i
            if (r3 != 0) goto L1f
            r2.j = r0
            androidx.fragment.app.u r3 = r2.t
            r3.A(r2, r0)
            return
        L1f:
            java.lang.String r3 = "This transaction is already being added to the back stack"
            defpackage.i.m(r3)
            return
    }
}
