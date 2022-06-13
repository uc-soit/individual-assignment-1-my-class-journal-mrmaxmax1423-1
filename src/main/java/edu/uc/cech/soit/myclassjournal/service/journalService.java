package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class journalService implements IJournalService{

    private List<JournalEntry> entries = new ArrayList<>();

    @Override
    public void save(JournalEntry journalEntry){
        entries.add(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return this.entries;
    }

}

