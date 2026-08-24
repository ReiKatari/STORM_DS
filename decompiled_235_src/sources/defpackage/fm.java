package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm  reason: default package */
/* loaded from: classes.dex */
public final class fm {
    public final gm a;
    public final dm b;
    public final dm c;
    public final View d;

    public fm(gm gmVar, dm dmVar, dm dmVar2, View view) {
        this.a = gmVar;
        this.b = dmVar;
        this.c = dmVar2;
        this.d = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
        if (r7 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Menu menu) {
        int i;
        int i2;
        List actions;
        int i3;
        CharSequence title;
        Icon icon;
        boolean shouldShowIcon;
        CharSequence label;
        Drawable icon2;
        int i4;
        l07 l07Var = (l07) this.b.c();
        final int i5 = 0;
        if (nb3.k(l07Var, null)) {
            return false;
        }
        menu.clear();
        List list = l07Var.a;
        int size = list.size();
        int i6 = 0;
        int i7 = 1;
        int i8 = 1;
        while (i6 < size) {
            k07 k07Var = (k07) list.get(i6);
            int i9 = 2;
            if (k07Var instanceof s07) {
                i = i7 + 1;
                Object obj = k07Var.a;
                if (nb3.k(obj, nc1.i)) {
                    i4 = 16908320;
                } else if (nb3.k(obj, nc1.j)) {
                    i4 = 16908321;
                } else if (nb3.k(obj, nc1.k)) {
                    i4 = 16908322;
                } else if (nb3.k(obj, nc1.l)) {
                    i4 = 16908319;
                } else if (nb3.k(obj, nc1.m)) {
                    i4 = 16908355;
                } else {
                    i4 = i7;
                }
                final s07 s07Var = (s07) k07Var;
                MenuItem add = menu.add(i8, i4, i7, s07Var.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: em
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        String text;
                        int i10;
                        Intent intent;
                        ActivityOptions pendingIntentBackgroundActivityStartMode;
                        int i11 = i5;
                        Object obj2 = this;
                        Object obj3 = s07Var;
                        switch (i11) {
                            case 0:
                                ((s07) obj3).d.g(((fm) obj2).a);
                                return true;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                text = textClassification.getText();
                                if (text != null) {
                                    i10 = text.hashCode();
                                } else {
                                    i10 = 0;
                                }
                                intent = textClassification.getIntent();
                                PendingIntent activity = PendingIntent.getActivity(context, i10, intent, 201326592);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    try {
                                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                    }
                                } else {
                                    activity.send();
                                }
                                return true;
                        }
                    }
                });
            } else {
                if (k07Var instanceof y07) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i7 + 1;
                        final Context context = this.d.getContext();
                        y07 y07Var = (y07) k07Var;
                        final TextClassification textClassification = y07Var.b;
                        int i10 = y07Var.c;
                        if (i10 < 0) {
                            label = textClassification.getLabel();
                            MenuItem add2 = menu.add(16908353, 16908353, i7, label);
                            add2.setShowAsAction(2);
                            icon2 = textClassification.getIcon();
                            add2.setIcon(icon2);
                            add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: em
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    String text;
                                    int i102;
                                    Intent intent;
                                    ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    int i11 = i5;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (i11) {
                                        case 0:
                                            ((s07) obj3).d.g(((fm) obj2).a);
                                            return true;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            text = textClassification2.getText();
                                            if (text != null) {
                                                i102 = text.hashCode();
                                            } else {
                                                i102 = 0;
                                            }
                                            intent = textClassification2.getIntent();
                                            PendingIntent activity = PendingIntent.getActivity(context2, i102, intent, 201326592);
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                try {
                                                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                                    activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                                } catch (PendingIntent.CanceledException e) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                                }
                                            } else {
                                                activity.send();
                                            }
                                            return true;
                                    }
                                }
                            });
                        } else {
                            if (i10 == 0) {
                                i2 = 1;
                            } else {
                                i2 = i5;
                            }
                            actions = textClassification.getActions();
                            final RemoteAction d = q66.d(actions.get(i10));
                            if (i2 != 0) {
                                i3 = 16908353;
                            } else {
                                i3 = i5;
                            }
                            title = d.getTitle();
                            MenuItem add3 = menu.add(16908353, i3, i7, title);
                            if (i2 == 0) {
                                i9 = 0;
                            }
                            add3.setShowAsAction(i9);
                            if (i2 == 0) {
                                shouldShowIcon = d.shouldShowIcon();
                            }
                            icon = d.getIcon();
                            add3.setIcon(icon.loadDrawable(context));
                            add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: v47
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    PendingIntent actionIntent;
                                    ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    actionIntent = d.getActionIntent();
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        try {
                                            pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                            actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                        } catch (PendingIntent.CanceledException e) {
                                            Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                        }
                                        return true;
                                    }
                                    actionIntent.send();
                                    return true;
                                }
                            });
                        }
                    }
                } else if (k07Var instanceof w07) {
                    i8++;
                }
                i6++;
                i5 = 0;
            }
            i7 = i;
            i6++;
            i5 = 0;
        }
        return true;
    }
}
