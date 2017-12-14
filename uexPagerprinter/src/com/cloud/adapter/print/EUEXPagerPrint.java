package com.cloud.adapter.print;

import android.content.Context;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;

import org.zywx.wbpalmstar.engine.EBrowserView;
import org.zywx.wbpalmstar.engine.universalex.EUExBase;


/**
 * Created by zhang on 2017/9/19.
 */

public class EUEXPagerPrint extends EUExBase{
    EBrowserView meBrowserView;
    public EUEXPagerPrint(Context context, EBrowserView eBrowserView) {
        super(context, eBrowserView);
        meBrowserView=eBrowserView;
    }

    @Override
    protected boolean clean() {
        return false;
    }

    public static void onApplicationCreate(Context context){

    }

    public void pagerPrintView(String[] param){
        genPdfFile();
    }

    private void genPdfFile() {
        PrintManager printManager = (PrintManager) mContext.getSystemService(Context.PRINT_SERVICE);

        // Get a print adapter instance
        PrintDocumentAdapter printAdapter;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            printAdapter = meBrowserView.createPrintDocumentAdapter("my.pdf");
        } else {
            printAdapter = meBrowserView.createPrintDocumentAdapter();
        }

        // Create a print job with name and adapter instance
        String jobName = meBrowserView + " Document";

        PrintAttributes attributes = new PrintAttributes.Builder()
                .setMediaSize(PrintAttributes.MediaSize.ISO_A4)
                .setResolution(new PrintAttributes.Resolution("id", Context.PRINT_SERVICE, 200, 200))
                .setColorMode(PrintAttributes.COLOR_MODE_COLOR)
                .setMinMargins(PrintAttributes.Margins.NO_MARGINS)
                .build();

        printManager.print(jobName, printAdapter, attributes);


    }

    private void callBackPluginJs(String methodName, String jsonData){
        String js = SCRIPT_HEADER + "if(" + methodName + "){"
                + methodName + "('" + jsonData + "');}";
        onCallback(js);
    }
}
