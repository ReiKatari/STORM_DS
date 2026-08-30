package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fr  reason: default package */
/* loaded from: classes.dex */
public abstract class fr {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        l01 l01Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                l01Var = new bq0(clipData, 3);
            } else {
                m01 m01Var = new m01();
                m01Var.B = clipData;
                m01Var.L = 3;
                l01Var = m01Var;
            }
            aa7.j(textView, l01Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        l01 l01Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            l01Var = new bq0(clipData, 3);
        } else {
            m01 m01Var = new m01();
            m01Var.B = clipData;
            m01Var.L = 3;
            l01Var = m01Var;
        }
        aa7.j(view, l01Var.build());
        return true;
    }
}
